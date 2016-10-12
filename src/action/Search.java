package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.SearchDao;
import ob.Author;
import ob.Book;

import java.util.ArrayList;
import java.util.List;

public class Search extends ActionSupport {
    private String name;
    private List<Book> searchList = new ArrayList<Book>();

    public void setName(String name) {
        this.name = name;
    }

    public void setSearchList(List<Book> searchList) {
        this.searchList = searchList;
    }

    public String getName() {
        return name;
    }

    public List<Book> getSearchList() {
        return searchList;
    }

    public String execute() {
        SearchDao searchDao = new SearchDao();
        List<Author> authorList = new ArrayList<Author>();
        String attribute = "name";
        authorList = searchDao.searchAuthor(attribute, name);
        String authorID;
        boolean gotAuthor = false;
        if (!authorList.isEmpty())
            gotAuthor = true;
        if (gotAuthor) {
            attribute = "authorID";
            for (int i = 0; i < authorList.size(); i++) {
                authorID = authorList.get(i).getAuthorID();
                searchList.addAll(searchDao.searchBook(attribute, authorID));
            }
            return SUCCESS;
        }
        return ERROR;
    }
}
