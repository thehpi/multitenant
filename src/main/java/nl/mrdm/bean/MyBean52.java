package nl.mrdm.bean;

import nl.mrdm.BaseBean;
import nl.mrdm.EntityManagerHolder;
import nl.mrdm.IMyBean;
import nl.mrdm.qualifier.DbTest52;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class MyBean52 extends BaseBean implements IMyBean {
    @Inject
    @DbTest52
    EntityManager em;

    @Inject
    EntityManagerHolder emHolder;

    public void init() {
        emHolder.setEm(em);
    }

    public String getName() {
        return "TestBean52";
    }
}
