package JDBC.JDBC_connectionpool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class druid_test {
    public static void main(String args[]){
        //加载配置文件
        Properties pro = new Properties();
        InputStream is = druid_test.class.getClassLoader().getResourceAsStream("druid.properties");
        Connection connection = null;
        DataSource ds = null;
        try {
            pro.load(is);
            ds = DruidDataSourceFactory.createDataSource(pro);
            connection = ds.getConnection();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
