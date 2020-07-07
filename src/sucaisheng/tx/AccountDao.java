package sucaisheng.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {

    @Autowired
    JdbcTemplate jt;

    public void addMoney(int id, double money){
        int cows = jt.update("update user set money = money + ? where id = ?", money, id);
    }

    public void reduceMoney(int id, double money){
        jt.update("update user set money = money - ? where id = ?", money, id);
    }
}
