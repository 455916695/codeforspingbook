package com.decisive.pattern._8_proxy;

import com.ax.test.enumTest.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class InvcationHandlerImpl implements InvcationHandler {

    //持有 被代理的对象
    Person  person;

    public InvcationHandlerImpl(Person person) {
        this.person = person;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        try {
            if(method.getName().startsWith("get")) {
                return method.invoke(person,args);
            }else if(method.getName().startsWith("get")) {
                return method.invoke(person,args);
            }else if(method.getName().startsWith("set")) {
                return method.invoke(person,args);
            }
        }catch (Exception e){
            HashMap hashMap = new HashMap();
            List list = new ArrayList();  //实现
        }

        return null;
    }
}
