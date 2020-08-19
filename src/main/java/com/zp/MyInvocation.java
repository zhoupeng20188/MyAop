package com.zp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author zp
 * @create 2020/8/18 20:17
 */
public class MyInvocation implements InvocationHandler {
    Object o;

    public MyInvocation(Object o) {
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        if (method.getName().equals("test")) {
            System.out.println("my-----------proxy---------before");
        }
        obj = method.invoke(o, args);
        return obj;
    }
}
