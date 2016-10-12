package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.SearchDao;
import ob.Author;
import ob.Book;

import java.util.ArrayList;
import java.util.List;

public class Detail extends ActionSupport {
    private String ISBN;
    private Author author;
    private Book book;

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public Book getBook() {
        return book;
    }

    public String execute() {
        List<Author> authorList = new ArrayList<Author>();
        List<Book> bookList = new ArrayList<Book>();
        SearchDao searchDao = new SearchDao();
        String attribute = "ISBN";
        bookList = searchDao.searchBook(attribute, ISBN);
        book = bookList.get(0);
        attribute = "authorID";
        for(int i = 0; i < bookList.size(); i++) {
            String authorID = bookList.get(i).getAuthorID();
            authorList.addAll(searchDao.searchAuthor(attribute, authorID));
        }
        author = authorList.get(0);
        return SUCCESS;
    }
}
