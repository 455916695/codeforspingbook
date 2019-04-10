package com.decisive.pattern._8_proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public interface InvcationHandler {

    public Object invoke(Object proxy,Method method,Object[] args) throws InvocationTargetException, IllegalAccessException;

}
