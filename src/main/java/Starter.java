import sun.print.resources.serviceui_zh_TW;

import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Алена on 01.03.14.
 */
public class Starter {
//    private static final String UNIT_NAME = "Student";
//    private static EntityManagerFactory factory;
//    private static EntityManager em;


    public static void main(String[] args) {
//        factory = Persistence.createEntityManagerFactory(UNIT_NAME);
//        em = factory.createEntityManager();
//        StudentDAOorm studManager = new StudentDAOorm(em);
//        BookDAOorm bookManager = new BookDAOorm(em);

        //studManager.addStudent(new Student("Andrew", 4));
//        Student student1 = studManager.findStudent(1);
//        Student student2 = studManager.findStudent(2);
//        Student student3 = studManager.findStudent(3);
        //System.out.println(student);
//        studManager.removeStudent(student);
//        Book book1 = new Book("Java Core");
//        Book book2 = new Book("Bookvar");
//        Book book3 = new Book("Bible");
//        book1.setStudent(student1);
//        book2.setStudent(student2);
//        book3.setStudent(student3);
//        bookManager.addBook(book1);
//        bookManager.addBook(book2);
//        bookManager.addBook(book3);


//        Book book = bookManager.findBook(1);
//        System.out.println(book);
//        System.out.println(student.getBooks());

//        System.out.println("-----------");
//        TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s WHERE s.grade<3.5", Student.class);
//        List<Student> list = null;
//        list = query.getResultList();
//        //em.close();
//        if(list!=null) {
//            for(Student s: list) {
//                System.out.println(s.toString());
//            }
//        }
//
//        System.out.println("-----------");
//        TypedQuery<Book> queryB = em.createQuery("SELECT b FROM Book b WHERE b.student.id=1", Book.class);
//        List<Book> listB = null;
//        listB = queryB.getResultList();
//        //em.close();
//        if(listB!=null) {
//            for(Book b: listB) {
//                System.out.println(b.toString());
//            }
//        }
//
//        System.out.println("-----------");
//        TypedQuery<Long> queryI = em.createQuery("SELECT COUNT(b) FROM Student s, Book b " +
//                "WHERE b.student.id = s.id AND s.name LIKE '%Andrew%'", Long.class);
//        List<Long> listI = null;
//        listI = queryI.getResultList();
//        //em.close();
//        if(!listI.isEmpty()) {
//            for(Long i: listI) {
//                System.out.println(i);
//            }
//        }
//        System.out.println("-----------");
//        TypedQuery<Student> query1 = em.createQuery("SELECT s FROM Student s " +
//                "ORDER BY s.name", Student.class);
//        List<Student> list1 = null;
//        list1 = query1.getResultList();
//        //em.close();
//        if(list1!=null) {
//            for(Student s: list1) {
//                System.out.println(s.toString());
//            }
//        }

        StudentDAO stud = DAOFactory.getDAOFactory(1).getStudentDAO();
        Student s = stud.findStudent(1);
        System.out.println(s);

        BookDAO boo = DAOFactory.getDAOFactory(1).getBookDAO();
        System.out.println(boo.findBook(3));
        //boo.addBook(new Book("Shakespeare", s));

    }

}
