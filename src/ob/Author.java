package ob;

public class Author {
    private String authorID;
    private String name;
    private String age;
    private String country;

    public void setAuthorID(String authorID){
        this.authorID = authorID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getAuthorID(){
        return authorID;
    }

    public String getName(){
        return name;
    }

    public String getAge(){
        return age;
    }

    public String getCountry(){
        return country;
    }
}
