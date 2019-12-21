package JDBC.jdbctest1;

import JDBC.domain.student;
import JDBC.util.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 使用Util工具进行操作
 */

public class test3 {
    @Test
    public void run(){
        ResultSet res = null;
        Connection connection = null;
        Statement stmt = null;
        try {
            connection = JDBCUtils.getConnection();
            stmt = connection.createStatement();
            String sql = "select * from student";
            res = stmt.executeQuery(sql);
            while(res.next()){
                int id = res.getInt("id");
                String name = res.getString("name");
                student st = new student();
                st.setId(id);
                st.setName(name);
                System.out.println(st);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt,connection,res);
        }
    }
}
