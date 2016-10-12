package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import static dao.ConnectDao.getConnection;

public class AddDao {
    public int addAuthor(String authorID, String name, String age, String country) {
        Connection conn = getConnection();
        String sql = "insert into author values(?, ?, ?, ?)";
        PreparedStatement prest;
        int suc = 0;
        try {
            prest = conn.prepareStatement(sql);
            prest.setString(1, authorID);
            prest.setString(2, name);
            prest.setString(3, age);
            prest.setString(4, country);
            suc = prest.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return suc;
    }

    public int addBook(String ISBN, String title, String authorID, String publisher, String publishData, String price) {
        int suc = 0;
        Connection conn = getConnection();
        String sql = "insert into book values(?, ?, ?, ?, ?, ?)";
        PreparedStatement prest;
        try {
            prest = conn.prepareStatement(sql);
            prest.setString(1, ISBN);
            prest.setString(2, title);
            prest.setString(3, authorID);
            prest.setString(4, publisher);
            prest.setString(5, publishData);
            prest.setString(6, price);
            suc = prest.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return suc;
    }
}
