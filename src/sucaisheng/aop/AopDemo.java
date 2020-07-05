package sucaisheng.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sucaisheng.proxy.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:sucaisheng/aop/applicationContext.xml")
public class AopDemo {
    @Autowired
    IUserService userService;

    @Test
    public void testFn(){
        userService.getUser(5);
    }
}
