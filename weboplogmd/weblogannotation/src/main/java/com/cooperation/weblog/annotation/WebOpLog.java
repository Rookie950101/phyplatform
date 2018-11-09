package com.cooperation.weblog.annotation;


import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WebOpLog {
     String operation() default "";
}
