package sucaisheng.tx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:sucaisheng/tx/applicationContext.xml")
public class TxDemo {

    @Autowired
    AccountService accountService;

    @Test
    public void testFn(){
        accountService.transfer(1, 2, 100);
    }
}
