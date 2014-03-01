/**
 * Created by Алена on 01.03.14.
 */
import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue  (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float grade;

    public Student(String name, float grade) {

        this.name = name;
        this.grade = grade;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
