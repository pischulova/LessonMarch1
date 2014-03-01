/**
 * Created by Алена on 01.03.14.
 */
public interface BookDAO {

    public void addBook(Book book);
    public Book findBook(int id);
    public void removeBook(Book book);

}
