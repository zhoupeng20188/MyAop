package com.zp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author zp
 * @create 2020/8/18 20:07
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        Person a = (Person) ac.getBean("a");
        System.out.println(a);
        a.test();
    }
}
