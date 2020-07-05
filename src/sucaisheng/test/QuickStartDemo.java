package sucaisheng.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sucaisheng.annotation.School;
import sucaisheng.pojo.User;

public class QuickStartDemo {

    @Test
    public void testFn1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)classPathXmlApplicationContext.getBean("user");
        user.setName("张山");
        System.out.println(user);
    }

    @Test
    public void testFn2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user2 = (User)applicationContext.getBean("user3");
        System.out.println(user2);
    }

    @Test
    public void testFn3(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("sucaisheng/injection/injection.xml");
        User user = (User)classPathXmlApplicationContext.getBean("user4");
        System.out.println(user);
    }

    @Test
    public void testFn4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sucaisheng/annotation/annotation.xml");
        School school = (School)applicationContext.getBean("school");
        System.out.println(school);
    }
}
