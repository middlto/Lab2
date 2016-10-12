package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.AllDao;
import ob.Book;

import java.util.ArrayList;
import java.util.List;

public class AllBook extends ActionSupport {
    private List<Book> bookList = new ArrayList<Book>();

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public String execute() {
        AllDao allDao = new AllDao();
        bookList.addAll(allDao.allBook());
        return SUCCESS;
    }
}
