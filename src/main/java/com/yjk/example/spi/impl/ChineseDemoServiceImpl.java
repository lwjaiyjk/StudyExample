package com.yjk.example.spi.impl;

import com.yjk.example.spi.DemoService;

/**
 * @author yujiakui
 * @version 1.0
 * Email: jkyu@haiyi-info.com
 * date: 2018/9/12 15:05
 * description：
 **/
public class ChineseDemoServiceImpl implements DemoService{
    public String sayHi(String msg) {
        return "你好, "+msg;
    }
}
