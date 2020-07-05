package sucaisheng.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserJVMFactory implements InvocationHandler {

    private IUserService us;

    public UserJVMFactory(IUserService us){
        this.us = us;
    }

    public IUserService getProxyUserService(){
        return (IUserService) Proxy.newProxyInstance(us.getClass().getClassLoader(), us.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JVM前操作");
        Object invoke = method.invoke(us, args);
        return invoke;
    }
}
