package com.zp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * @Author zp
 * @create 2020/8/18 20:15
 */
public class MyProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // 手动模拟动态代理
        Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(), bean.getClass().getInterfaces(), new MyInvocation(bean));
        return o;
    }
}
