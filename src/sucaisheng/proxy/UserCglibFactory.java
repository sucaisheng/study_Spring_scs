package sucaisheng.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserCglibFactory implements MethodInterceptor {
    
    public IUserService getUserProxyService(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(this);
        IUserService us = (IUserService)enhancer.create();
        return us;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib前过滤");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("Cglib后过滤");
        return obj;
    }
}

