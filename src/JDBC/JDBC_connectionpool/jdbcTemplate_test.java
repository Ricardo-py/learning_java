package JDBC.JDBC_connectionpool;


import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.Map;

public class jdbcTemplate_test {

    //修改名称
    @Test
    public void test1(){
        JdbcTemplate template = new JdbcTemplate(utils.getDataSource());
        String sql = "update student set name = 'zhangsan' where id = 1";
        int count = template.update(sql);
        System.out.println(count);
    }
    @Test
    //添加一条记录
    public void test2(){
        JdbcTemplate template = new JdbcTemplate(utils.getDataSource());
        String sql = "insert student value(?,?)";
        int count = template.update(sql,4,"mazi");
        System.out.println(count);
    }

    @Test
    //删除刚才添加的记录
    public void test3(){
        JdbcTemplate template = new JdbcTemplate(utils.getDataSource());
        String sql = "delete from student where id = 4";
        int count = template.update(sql);
        System.out.println(count);
    }

    @Test
    //查询id为1或者id为2的记录封装为map集合
    public void test4(){
        JdbcTemplate template = new JdbcTemplate(utils.getDataSource());
        String sql = "select * from student where id = ?";
        Map<String,Object> map = template.queryForMap(sql,1);
        System.out.println(map);
    }

    @Test
    //查询所有的结果集合
    public void test5(){
        JdbcTemplate template = new JdbcTemplate(utils.getDataSource());
        String sql = "select * from student";
        List<Map<String,Object>> list = template.queryForList(sql);
        for (Map<String, Object> map : list){
            System.out.println(map);
        }
    }

    //再一次添加数据
    @Test
    public void test6(){
        JdbcTemplate template = new JdbcTemplate(utils.getDataSource());
        String sql = "insert student value(?,?)";
        int count = template.update(sql,4,"mazi");
        System.out.println(count);
    }

    //将结果封装
    @Test
    public void test7(){
        JdbcTemplate template = new JdbcTemplate(utils.getDataSource());
        String sql = "select * from student";
        List<student> list = template.query(sql,new BeanPropertyRowMapper<student>(student.class));
        for (student st : list){
            System.out.println(st);
        }
    }

}
