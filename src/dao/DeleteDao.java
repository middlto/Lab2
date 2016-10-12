package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import static dao.ConnectDao.getConnection;

public class DeleteDao {
    public int deleteAuthor(String attribute, String value) {
        Connection conn = getConnection();
        String sql = "delete from author where ! = ?";
        sql = sql.replace("!", attribute);
        PreparedStatement prest;
        int suc = 0;
        try {
            prest = conn.prepareStatement(sql);
            prest.setString(1, value);
            suc = prest.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return suc;
    }

    public int deleteBook(String attribute, String value) {
        Connection conn = getConnection();
        String sql = "delete from book where ! = ?";
        sql = sql.replace("!", attribute);
        PreparedStatement prest;
        int suc = 0;
        try {
            prest = conn.prepareStatement(sql);
            prest.setString(1, value);
            suc = prest.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return suc;
    }
}
