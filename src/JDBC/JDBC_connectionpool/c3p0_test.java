package JDBC.JDBC_connectionpool;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class c3p0_test {
    public static void main(String[] args){
        DataSource ds = new ComboPooledDataSource();
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        try {
            connection = ds.getConnection();

//            String sql = "insert student value(?,?)";
//            stmt = connection.prepareStatement(sql);
//            stmt.setInt(1,3);
//            stmt.setString(2,"wangwu");
//            stmt.executeUpdate();


            String sql = "delete from student where id = ? and name = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1,1);
            stmt.setString(2,"wangwu");
            stmt.executeUpdate();

            stmt = connection.prepareStatement("select * from student where id = ?");
            stmt.setInt(1,3);
            res = stmt.executeQuery();
            while (res.next()){
                System.out.println(res.getInt("id") + ":" + res.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (res != null){
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
