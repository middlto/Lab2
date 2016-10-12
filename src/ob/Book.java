package ob;


public class Book {
    private String ISBN;
    private String title;
    private String authorID;
    private String publisher;
    private String publishData;
    private String price;

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthorID(String authorID){
        this.authorID = authorID;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public void setPublishData(String publishData){
        this.publishData = publishData;
    }

    public void setPrice(String price) { this.price = price; }

    public String getISBN(){
        return ISBN;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthorID(){
        return authorID;
    }

    public String getPublisher(){
        return publisher;
    }

    public String getPublishData(){
        return publishData;
    }

    public String getPrice() { return price; }
}
