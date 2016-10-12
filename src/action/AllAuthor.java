package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.AllDao;
import ob.Author;

import java.util.ArrayList;
import java.util.List;

public class AllAuthor extends ActionSupport {
    private List<Author> authorList = new ArrayList<Author>();

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public String execute() {
        AllDao allDao = new AllDao();
        authorList.addAll(allDao.allAuthor());
        return SUCCESS;
    }
}
