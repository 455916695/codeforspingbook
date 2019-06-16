package demo.com.ax.ResultDAop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyServieProxy<T> {

    public T createProxy(Object target) {

        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new ResultHandler(target);

        return (T) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);

    }

}
