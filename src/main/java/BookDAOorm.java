import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Алена on 01.03.14.
 */
public class BookDAOorm implements BookDAO{
    private EntityManager em;

    public BookDAOorm() {
        this.em = DerbySingleton.getEMS();
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
