import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Алена on 01.03.14.
 */
public class BooktDAOorm implements BookDAO{
    private static final String UNIT_NAME = "Student";
    private static EntityManagerFactory factory;
    private EntityManager em;

    public BooktDAOorm() {
        factory = Persistence.createEntityManagerFactory(UNIT_NAME);
        em = factory.createEntityManager();
    }

    public BooktDAOorm(EntityManager em) {
        this.em = em;
    }

    @Override
    public void addBook(Book book) {
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
    }

    @Override
    public Book findBook(int id) {
        return em.find(Book.class, id);
    }

    @Override
    public void removeBook(Book book) {
        em.getTransaction().begin();
        em.remove(book);
        em.getTransaction().commit();
    }
}
