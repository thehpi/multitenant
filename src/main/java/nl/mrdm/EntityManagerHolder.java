package nl.mrdm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;

@RequestScoped
public class EntityManagerHolder {
    private static Logger logger = LoggerFactory.getLogger(DatabaseProducer.class);

    EntityManager em;

    public EntityManager getEm() {
        logger.error("Get Em from Holder: "+em);
        return em;
    }

    public void setEm(EntityManager em) {
        logger.error("Set Em to Holder: "+em);
        this.em = em;
    }
}
