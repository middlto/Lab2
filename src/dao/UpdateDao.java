package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import static dao.ConnectDao.getConnection;

public class UpdateDao {
    public int updateBook(String authorID, String publisher, String publishData, String price, String ISBN) {
        int suc = 0;
        Connection conn = getConnection();
        String sql = "update book set authorID=?, publisher=?, publishDate=?, price=? where ISBN=?";
        PreparedStatement prest;
        try {
            prest = conn.prepareStatement(sql);
            prest.setString(1, authorID);
            prest.setString(2, publisher);
            prest.setString(3, publishData);
            prest.setString(4, price);
            prest.setString(5, ISBN);
            suc = prest.executeUpdate();
            prest.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return suc;
    }
}
