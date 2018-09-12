package com.yjk.example.spi.impl;

import com.yjk.example.spi.DemoService;

/**
 * @author yujiakui
 * @version 1.0
 * Email: jkyu@haiyi-info.com
 * date: 2018/9/12 15:04
 * description：
 **/
public class EnglishDemoServiceImpl implements DemoService{
    public String sayHi(String msg) {
        return "Hello, "+msg;
    }
}
