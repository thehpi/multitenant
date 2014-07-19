package nl.mrdm;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Stateless
public class Service {

    @Inject
    @Database
    EntityManager em;

    public String get() {
        List<Hans> list = em.createQuery("select h from Hans h",Hans.class).getResultList();

        StringBuilder buf = new StringBuilder();
        for (Hans hans : list) {
            buf.append(hans.getF1()).append("\n");
        }
        return buf.toString();
    }
}
