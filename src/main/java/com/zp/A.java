package com.zp;

import org.springframework.stereotype.Component;

/**
 * @Author zp
 * @create 2020/8/18 20:09
 */
@Component
@ZpAnno
public class A implements Person{
    @Override
    public void test(){
        System.out.println("a-----------test");
    }
}
