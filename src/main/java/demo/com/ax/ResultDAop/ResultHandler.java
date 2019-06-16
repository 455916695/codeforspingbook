package demo.com.ax.ResultDAop;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ResultHandler implements InvocationHandler {

    private Object target;

    public ResultHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;

        try {
            result = method.invoke(target, args);
//            int i = 1 / 0;
            //发现问题的原因了，如果进行反射调用时，被调用的方法参数异常并抛出异常
        } catch (Throwable t) {
            result = t;
        }

        return result;
    }
}
