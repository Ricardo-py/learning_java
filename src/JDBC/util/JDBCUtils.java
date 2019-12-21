package JDBC.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String url = null;
    private static String driver = null;
    private static String username = null;
    private static String password = null;

    static{
        Properties pro = new Properties();
        //1. 创建Properties集合类。

        //获取src路径下的文件的方式--->ClassLoader 类加载器
        ClassLoader classLoader = JDBCUtils.class.getClassLoader();
        URL res  = classLoader.getResource("jdbc.properties");
        String path = res.getPath();
        // System.out.println(path);///D:/IdeaProjects/itcast/out/production/day04_jdbc/jdbc.properties
        //2. 加载文件
        // pro.load(new FileReader("D:\\IdeaProjects\\itcast\\day04_jdbc\\src\\jdbc.properties"));
        try {
            pro.load(new FileReader(path));
            driver = pro.getProperty("driver");
            url = pro.getProperty("url");
            username = pro.getProperty("username");
            password = pro.getProperty("password");
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Statement stmt, Connection conn){
        if (stmt != null){
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

    public static void close(Statement stmt, Connection conn, ResultSet res){
        close(stmt,conn);
        if (res != null){
            try {
                res.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
