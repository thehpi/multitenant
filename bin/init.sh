#!/bin/bash

#---------------------------------------------
add_stuff() {
	echo "Adding module"
	jboss-cli.sh -c --command="module add --name=system.layers.base.com.mysql --resources=setup/mysql/mysql-connector-java-5.1.29-bin.jar --dependencies=javax.api,javax.transaction.api"

	echo "Adding driver"
	jboss-cli.sh -c "/subsystem=datasources/jdbc-driver=mysql:add(driver-name=mysql, driver-module-name=system.layers.base.com.mysql, driver-class-name=com.mysql.jdbc.Driver)"

	echo "Adding datasource"
	jboss-cli.sh -c "/subsystem=datasources/data-source=test1:add( driver-name=mysql, jta=true, user-name=test, password=test, connection-url=jdbc:mysql://localhost:8889/test1, min-pool-size=5, max-pool-size=150, jndi-name=java:/jboss/datasources/test1, enabled=true, validate-on-match=true, valid-connection-checker-class-name=org.jboss.jca.adapters.jdbc.extensions.mysql.MySQLValidConnectionChecker, exception-sorter-class-name=org.jboss.jca.adapters.jdbc.extensions.mysql.MySQLExceptionSorter"
	jboss-cli.sh -c "/subsystem=datasources/data-source=test2:add( driver-name=mysql, jta=true, user-name=test, password=test, connection-url=jdbc:mysql://localhost:8889/test2, min-pool-size=5, max-pool-size=150, jndi-name=java:/jboss/datasources/test2, enabled=true, validate-on-match=true, valid-connection-checker-class-name=org.jboss.jca.adapters.jdbc.extensions.mysql.MySQLValidConnectionChecker, exception-sorter-class-name=org.jboss.jca.adapters.jdbc.extensions.mysql.MySQLExceptionSorter"
}

#---------------------------------------------
remove_stuff() {
	echo "Removing datasource"
	jboss-cli.sh -c "/subsystem=datasources/data-source=test1:remove"
	jboss-cli.sh -c "/subsystem=datasources/data-source=test2:remove"

	echo "Removing driver"
	jboss-cli.sh -c "/subsystem=datasources/jdbc-driver=mysql:remove"

	echo "Removing module"
	jboss-cli.sh -c "module remove --name=system.layers.base.com.mysql"
}

###################################
case "$1" in
	-a)
		add_stuff
	;;
	-r)
		remove_stuff
	;;
	*)
		echo "Usage: ${0##*/} -a|-r" >&2
		exit 1
	;;
esac

