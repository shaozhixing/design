package xx.ms.design.partern.demo.proxy.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: shaozhixing
 * @date: 2020/7/11 15:44
 * @copyright: gofun
 */
public class NationProxy implements InvocationHandler {

    private Object object = null;

    public Object getInstance (Object obj) {
        this.object = obj;
        Class<?> clazz = obj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = method.invoke(this.object, args);
        return obj;
    }
}
