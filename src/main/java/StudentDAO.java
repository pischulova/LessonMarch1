/**
 * Created by Алена on 01.03.14.
 */
public interface StudentDAO {

    public void addStudent(Student student);
    public Student findStudent(int id);
    public void removeStudent(Student student);
    public Student updateStudent(Student student);

}
