package nl.mrdm.bean;

import nl.mrdm.BaseBean;
import nl.mrdm.EntityManagerHolder;
import nl.mrdm.IMyBean;
import nl.mrdm.qualifier.DbTest29;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class MyBean29 extends BaseBean implements IMyBean {
    @Inject
    @DbTest29
    EntityManager em;

    @Inject
    EntityManagerHolder emHolder;

    public void init() {
        emHolder.setEm(em);
    }

    public String getName() {
        return "TestBean29";
    }
}
