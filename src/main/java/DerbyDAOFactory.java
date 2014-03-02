/**
 * Created by Алена on 02.03.14.
 */
public class DerbyDAOFactory extends DAOFactory {
    public DerbyDAOFactory() {

    }

    @Override
    public StudentDAO getStudentDAO() {
        return new StudentDAOorm();
    }

    @Override
    public BookDAO getBookDAO() {
        return new BookDAOorm();
    }
}
