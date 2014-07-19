package nl.mrdm.bean;

import nl.mrdm.BaseBean;
import nl.mrdm.EntityManagerHolder;
import nl.mrdm.IMyBean;
import nl.mrdm.qualifier.DbTest12;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class MyBean12 extends BaseBean implements IMyBean {
    @Inject
    @DbTest12
    EntityManager em;

    @Inject
    EntityManagerHolder emHolder;

    public void init() {
        emHolder.setEm(em);
    }

    public String getName() {
        return "TestBean12";
    }
}
