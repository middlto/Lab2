package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.DeleteDao;
import dao.SearchDao;

public class Delete extends ActionSupport {
    private String ISBN;

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public String execute() {
        DeleteDao deleteDao = new DeleteDao();
        SearchDao searchDao = new SearchDao();
        String authorID = searchDao.searchBook("ISBN", ISBN).get(0).getAuthorID();
        deleteDao.deleteBook("ISBN", ISBN);
        if(searchDao.searchBook("authorID", authorID).isEmpty())
            deleteDao.deleteAuthor("authorID", authorID);
        return SUCCESS;
    }
}
