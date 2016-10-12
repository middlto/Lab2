package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.*;
import ob.Author;
import ob.Book;

import java.util.List;

public class Update extends ActionSupport {
    private String publisher;
    private String publishData;
    private String price;
    private String name;
    private String age;
    private String country;
    private String ISBN;
    private String title;
    private String authorID;

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishData() {
        return publishData;
    }

    public void setPublishData(String publishData) {
        this.publishData = publishData;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private static String fetchAuthorID(String name, String age, String country, SearchDao searchDao, AddDao addDao) {
        String authorID = "1";
        List<Author> authorList = searchDao.searchAuthor("name", name);
        for(int i = 0; i < authorList.size(); i++) {
            Author author = authorList.get(i);
            if (age.equals(author.getAge()) && country.equals(author.getCountry())) {
                authorID = author.getAuthorID();
                return authorID;
            }
        }
        AllDao allDao = new AllDao();
        List<Author> allAuthorList = allDao.allAuthor();
        int i = 0;
        while(i < allAuthorList.size()) {
            if(authorID.equals(allAuthorList.get(i).getAuthorID())) {
                authorID = String.valueOf(Integer.parseInt(authorID) + 1);
                i = 0;
            }
            else
                i++;
        }
        addDao.addAuthor(authorID, name, age, country);
        return authorID;
    }

    private static void checkAuthor(String name, SearchDao searchDao) {
        List<Author> authorList = searchDao.searchAuthor("name", name);
        for(int i = 0; i < authorList.size(); i++) {
            Author author = authorList.get(i);
            List<Book> bookList = searchDao.searchBook("authorID", author.getAuthorID());
            if(bookList.isEmpty()) {
                DeleteDao deleteDao = new DeleteDao();
                deleteDao.deleteAuthor("authorID", author.getAuthorID());
            }
        }
    }

    public String execute() {
        SearchDao searchDao = new SearchDao();
        UpdateDao updateDao = new UpdateDao();
        AddDao addDao = new AddDao();
        title = searchDao.searchBook("ISBN", ISBN).get(0).getTitle();
        authorID = fetchAuthorID(name, age, country, searchDao, addDao);
        updateDao.updateBook(authorID, publisher, publishData, price, ISBN);
        checkAuthor(name, searchDao);
        return SUCCESS;
    }
}
