package com.lijiulong.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotatioService {
    @Action(name = "注解式拦截的add操作")
    public void add(){
        System.out.println("真正执行到DemoAnnotationService的add方法");
        System.out.println("DemoAnnotationService.add方法执行结束");
    }
}
