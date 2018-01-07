package com.yanevskyy.library;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy // включаем использование AspectJ
@ComponentScan(basePackages = {"ru.javabegin.training.library"})
public class ServletInitializer extends SpringBootServletInitializer {

}

