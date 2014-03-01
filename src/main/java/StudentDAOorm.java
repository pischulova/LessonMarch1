import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Алена on 01.03.14.
 */
public class StudentDAOorm implements StudentDAO{
    private static final String UNIT_NAME = "Student";
    private static EntityManagerFactory factory;
    private EntityManager em;

    public StudentDAOorm() {
        factory = Persistence.createEntityManagerFactory(UNIT_NAME);
        em = factory.createEntityManager();
    }

    public StudentDAOorm(EntityManager em) {
        this.em = em;
    }

    @Override
    public void addStudent(Student student) {
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
    }

    @Override
    public Student findStudent(int id) {
        return em.find(Student.class, id);
    }

    @Override
    public void removeStudent(Student student) {
        em.getTransaction().begin();
        em.remove(student);
        em.getTransaction().commit();
    }
}
