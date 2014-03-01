import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Алена on 01.03.14.
 */
public class Starter {
    private static final String UNIT_NAME = "Student";
    private static EntityManagerFactory factory;
    private static EntityManager em;


    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(UNIT_NAME);
        em = factory.createEntityManager();
        StudentDAOorm studManager = new StudentDAOorm(em);
        BooktDAOorm bookManager = new BooktDAOorm(em);

        //studManager.addStudent(new Student("Andrew", 4));
        Student student = studManager.findStudent(3);
        System.out.println(student);
//        studManager.removeStudent(student);
//        Book book1 = new Book("Java Core");
//        Book book2 = new Book("Bookvar");
//        book1.setStudent(student);
//        book2.setStudent(student);
//        bookManager.addBook(book1);
//        bookManager.addBook(book2);

        Book book = bookManager.findBook(1);
        System.out.println(book);
        System.out.println(student.getBooks());

    }

}
