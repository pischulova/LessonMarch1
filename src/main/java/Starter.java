/**
 * Created by Алена on 01.03.14.
 */
public class Starter {

    public static void main(String[] args) {
        StudentDAOdb studManager = new StudentDAOdb();

        /*Student student = new Student(2, "Bob", 3);
        studManager.addStudent(student);*/

        System.out.println(
                studManager.findStudent(1)
        );
    }
}
