import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Алена on 01.03.14.
 */
public class Starter {
    private static final String UNIT_NAME = "Student";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        StudentDAOorm studManager = new StudentDAOorm();

        studManager.addStudent(new Student("Alice", 5));
        System.out.println(studManager.findStudent(3));

    }

}
