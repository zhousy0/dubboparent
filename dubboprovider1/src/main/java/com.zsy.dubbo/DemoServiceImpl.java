package com.zsy.dubbo;

import com.zsy.dubbo.api.DemoService;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello1 " + name;
    }

    @Override
    public String sayHi(String name) {
        return "Hi1 " + name;
    }
}
