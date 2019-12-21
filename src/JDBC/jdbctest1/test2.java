package JDBC.jdbctest1;

import org.junit.Test;

import java.sql.*;

public class test2 {
    @Test
    public void run(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","suntong1547");
                stmt = conn.createStatement();
                String sql = "insert student value(2,'wangwu')";
                stmt.executeUpdate(sql);
                String sql3 = "delete from student where id = 1";
                stmt.executeUpdate(sql3);
                String sql2 = "select * from student";
                res = stmt.executeQuery(sql2);
                while (res.next()){
                    int id= res.getInt("id");
                    String name = res.getString("name");
                    System.out.println("id:" + id + " name:" + name);
                }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
