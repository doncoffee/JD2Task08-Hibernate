package by.academy.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static by.academy.util.Constants.PERSISTENCE_UNIT_NAME;

public class HibernateUtil {
    private static final EntityManagerFactory FACTORY =
            Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }

    public static void close() {
        FACTORY.close();
    }
}
