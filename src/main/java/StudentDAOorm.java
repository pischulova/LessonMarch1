import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Алена on 01.03.14.
 */
public class StudentDAOorm implements StudentDAO{
    private EntityManager em;

    public StudentDAOorm() {
        this.em = DerbySingleton.getEMS();
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

    @Override
    public Student updateStudent(Student student) {
        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
        return null;
    }
}
