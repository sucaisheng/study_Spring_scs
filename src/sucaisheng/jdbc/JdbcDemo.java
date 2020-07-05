package sucaisheng.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sucaisheng.aop.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:sucaisheng/jdbc/applicationContext.xml")
public class JdbcDemo {

    @Autowired
    JdbcTemplate jt;

    @Test
    public void testFn(){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        JdbcTemplate jt = new JdbcTemplate(dataSource);
        List<User> userList = jt.query("select * from user", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setAge(resultSet.getInt("age"));
                return user;
            }
        });

        System.out.println(userList);
    }

    @Test
    public void testFn1(){
        int cows = jt.update("update user set username = ? where id = ?", "wangwu", 1);
        if(cows > 0){
            System.out.println("更新成功！");
        }
    }
}
