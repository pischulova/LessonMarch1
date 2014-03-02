import com.sun.org.apache.xpath.internal.functions.FuncUnparsedEntityURI;
import org.eclipse.persistence.internal.descriptors.PersistenceEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Алена on 02.03.14.
 */
public class DerbySingleton {
    private static DerbySingleton ourInstance = new DerbySingleton();

    private static final String UNIT_NAME = "Unit2";
    private static EntityManagerFactory factory;
    private static EntityManager em = null;

    public static EntityManager getEMS() {
        if(em!=null) {
            return em;
        } else {
            factory = Persistence.createEntityManagerFactory(UNIT_NAME);
            EntityManager em = factory.createEntityManager();
            return em;
        }
    }

    private DerbySingleton() {}


}
