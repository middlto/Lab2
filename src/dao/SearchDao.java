package dao;


import ob.Author;
import ob.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static dao.ConnectDao.getConnection;

public class SearchDao {
    public List<Author> searchAuthor(String attribute, String value){
        Connection conn = getConnection();
        String sql = "select * from author where ! = ?";
        sql = sql.replace("!", attribute);
        PreparedStatement prest;
        List<Author> authorList = new ArrayList<Author>();
        try {
            prest = conn.prepareStatement(sql);
            prest.setString(1, value);
            ResultSet result = prest.executeQuery();
            while (result.next()) {
                Author author = new Author();
                author.setAuthorID(result.getString(1));
                author.setName(result.getString(2));
                author.setAge(result.getString(3));
                author.setCountry(result.getString(4));
                authorList.add(author);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return authorList;
    }

    public List<Book> searchBook(String attribute, String value) {
        Connection conn = getConnection();
        List<Book> bookList = new ArrayList<Book>();
        String sql = "select * from book where ! = ?";
        sql = sql.replace("!", attribute);
        PreparedStatement prest;
        try {
            prest = conn.prepareStatement(sql);
            prest.setString(1, value);
            ResultSet result = prest.executeQuery();
            while (result.next()) {
                Book book = new Book();
                book.setISBN(result.getString(1));
                book.setTitle(result.getString(2));
                book.setAuthorID(result.getString(3));
                book.setPublisher(result.getString(4));
                book.setPublishData(result.getString(5));
                book.setPrice(result.getString(6));
                bookList.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }
}
