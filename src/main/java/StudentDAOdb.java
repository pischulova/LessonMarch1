import java.sql.*;

/**
 * Created by Алена on 01.03.14.
 */
public class StudentDAOdb implements StudentDAO {
    private Connection connection;
    private final String uri = ("jdbc:derby:C:/Users/Алена/IdeaProjects/LessonMarch1/db");

    private final String addStudent = "INSERT INTO STUDENT (ID, NAME, GRADE) VALUES (?, ?, ?)";
    private final String findStudent = "SELECT * FROM STUDENT WHERE ID=?";
    private final String deleteStudent = "";

    public StudentDAOdb() {
        try {
            this.connection = DriverManager.getConnection(uri);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addStudent(Student student) {
        try {
            PreparedStatement stmt = connection.prepareStatement(addStudent);
            stmt.setInt(1, student.getId());
            stmt.setString(2, student.getName());
            stmt.setFloat(3, student.getGrade());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student findStudent(int id) {
        Student s =null;
        try {
            PreparedStatement stmt = connection.prepareStatement(findStudent);
            stmt.setInt(1, id);
            ResultSet res = stmt.executeQuery();

            while(res.next()) {
                s= new Student(res.getString("name"), res.getFloat("grade"));
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }


}
