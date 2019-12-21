package multithreading.test_countdownLatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*

 */
public class test2 {
    public static void main(String args[]){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_demo","root","suntong1547");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
