package sucaisheng.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sucaisheng.annotation.School;
import sucaisheng.proxy.IUserService;
import sucaisheng.proxy.UserCglibFactory;
import sucaisheng.proxy.UserJVMFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:sucaisheng/annotation/annotation.xml")
public class JUnit4Demo {

    @Autowired
    School school;
    @Autowired
    IUserService us;

    @Test
    public void testFn(){
        System.out.println(school);
    }

    @Test
    public void testFn1(){
        UserJVMFactory userJVMFactory = new UserJVMFactory(us);
        IUserService proxyUserService = userJVMFactory.getProxyUserService();
        proxyUserService.deletedUser(5);
    }

    @Test
    public void testFn2(){
        UserCglibFactory userCglibFactory = new UserCglibFactory();
        IUserService userProxyService = userCglibFactory.getUserProxyService();
        userProxyService.getUser(6);
    }
}
