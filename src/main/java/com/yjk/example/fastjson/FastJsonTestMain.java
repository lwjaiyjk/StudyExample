package com.yjk.example.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujiakui
 * @version 1.0
 * Email: jkyu@haiyi-info.com
 * date: 2018/9/18 8:50
 * description：
 **/
public class FastJsonTestMain {

    public static void main(String[] args) {
      Person person = new Person();
      person.setName("yjk");
      person.setSex("male");

        List<Addr> addrs = new ArrayList<Addr>();
        Addr tempAddr = new Addr();
        tempAddr.setCity("china");
        tempAddr.setStreet("xxxxx");
        addrs.add(tempAddr);

        tempAddr = new Addr();
        tempAddr.setCity("hefei");
        tempAddr.setStreet("yyyyy");
        addrs.add(tempAddr);

        person.setAddrs(addrs);

        String jsonStr = JSON.toJSONString(person, SerializerFeature.WriteClassName);
        System.out.println(jsonStr);
        ParserConfig parserConfig = ParserConfig.getGlobalInstance();
        parserConfig.setAutoTypeSupport(true);
        Person b = (Person) JSON.parse(jsonStr,parserConfig);
        System.out.println(b);
    }
}
