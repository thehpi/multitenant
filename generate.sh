#!/bin/bash

producer()
{
cat <<EOF
    @PersistenceContext(unitName = "test$i")
    private EntityManager em$i;

    @Produces
    @DbTest$i
    public EntityManager createEntityManager$i() {
        return em$i;
    }

EOF
}

#-----------------------
qualifier()
{
cat <<EOF > src/main/java/nl/mrdm/DbTest$i.java
package nl.mrdm;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
public @interface DbTest$i {
}
EOF

}

#-----------------------
bean()
{
cat <<EOF > src/main/java/nl/mrdm/bean/MyBean$i.java
package nl.mrdm.bean;

import nl.mrdm.BaseBean;
import nl.mrdm.EntityManagerHolder;
import nl.mrdm.IMyBean;
import nl.mrdm.qualifier.DbTest$i;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class MyBean$i extends BaseBean implements IMyBean {
    @Inject
    @DbTest$i
    EntityManager em;

    @Inject
    EntityManagerHolder emHolder;

    public void init() {
        emHolder.setEm(em);
    }

    public String getName() {
        return "TestBean$i";
    }
}
EOF
}

#-----------------------
persistence()
{
cat <<EOF >> src/main/resources/META-INF/persistence.xml
    <persistence-unit name="test$i">
        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
        <jta-data-source>java:/jboss/datasources/test$i</jta-data-source>
        <mapping-file>META-INF/orm-schema$i.xml</mapping-file>
        <class>nl.mrdm.Hans</class>
        <exclude-unlisted-classes>true</exclude-unlisted-classes>
        <properties>
            <property name="hibernate.show_sql" value="true" />
            <property name="hibernate.ejb.interceptor" value="nl.mrdm.EntityInterceptor"/>
        </properties>
    </persistence-unit>
EOF
}

#-----------------------
schema()
{
cat <<EOF >> src/main/resources/META-INF/orm-schema$i.xml
<entity-mappings xmlns="http://xmlns.jcp.org/xml/ns/persistence/orm"
                 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                 xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence/orm http://xmlns.jcp.org/xml/ns/persistence/orm_2_1.xsd"
                 version="2.1">
    <persistence-unit-metadata>
        <persistence-unit-defaults>
            <schema>test$i</schema>
        </persistence-unit-defaults>
    </persistence-unit-metadata>
</entity-mappings>
EOF
}

#-----------------------
database()
{
	. ~/.mysql_local.root
cat <<EOF
create database test$i character set utf8;
use test$i;
create table hans (f1 varchar(100) default null ) engine=InnoDb default charset=latin1;
EOF
}

#-----------------------
data()
{
	. ~/.mysql_local.root
cat <<EOF
use test$i;
insert into hans (f1) values ('test${i}_1');
insert into hans (f1) values ('test${i}_2');
insert into hans (f1) values ('test${i}_3');
EOF
}

#-----------------------
datasource()
{
	jboss-cli.sh -c "/subsystem=datasources/data-source=test$i:add( driver-name=mysql, jta=true, user-name=test, password=test, connection-url=jdbc:mysql://localhost:8889/test$i, min-pool-size=5, max-pool-size=150, jndi-name=java:/jboss/datasources/test$i, enabled=true, validate-on-match=true, valid-connection-checker-class-name=org.jboss.jca.adapters.jdbc.extensions.mysql.MySQLValidConnectionChecker, exception-sorter-class-name=org.jboss.jca.adapters.jdbc.extensions.mysql.MySQLExceptionSorter"
}

################

for i in {3..100}
do
#	producer
#	qualifier
#	bean
	persistence
#	schema
#	database
#	data
#	datasource
done

