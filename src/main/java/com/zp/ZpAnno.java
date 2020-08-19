package com.zp;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author zp
 * @create 2020/8/18 20:14
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(MyProcessor.class)
public @interface ZpAnno {
}
