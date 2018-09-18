package com.yjk.example.fastjson;

import lombok.Data;

import java.util.List;

/**
 * @author yujiakui
 * @version 1.0
 * Email: jkyu@haiyi-info.com
 * date: 2018/9/18 8:47
 * description：
 **/
@Data
public class Person {

    private String name;

    private String sex;

    private List<Addr> addrs;
}
