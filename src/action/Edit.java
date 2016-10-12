package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.SearchDao;
import ob.Author;
import ob.Book;

public class Edit extends ActionSupport {
    private String ISBN;
    private Author author;
    private Book book;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String execute() {
        SearchDao searchDao = new SearchDao();
        book = searchDao.searchBook("ISBN", ISBN).get(0);
        String authorID = book.getAuthorID();
        author = searchDao.searchAuthor("authorID", authorID).get(0);
        return SUCCESS;
    }
}
