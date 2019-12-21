package JDBC.jdbctest1;

/*
查询mysql数据库中的所有数据
 */
import java.sql.*;

public class test {
    public static void main(String args[]){
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "suntong1547");
            stmt = conn.createStatement();
            String sql = "select * from student";
            res = stmt.executeQuery(sql);
            while (res.next()){
                int id = res.getInt("id");
                String name = res.getString("name");
                System.out.println("id:" + id + " name:" + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if (conn != null) {
                try {
                    conn.close();
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
        }
    }
}
