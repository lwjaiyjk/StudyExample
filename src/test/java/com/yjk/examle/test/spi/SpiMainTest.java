package com.yjk.examle.test.spi;

import com.yjk.example.spi.DemoService;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author yujiakui
 * @version 1.0
 * Email: jkyu@haiyi-info.com
 * date: 2018/9/12 15:08
 * description：
 **/
public class SpiMainTest {
    public static void main(String[] args) {
        ServiceLoader<DemoService> serviceLoader = ServiceLoader.load(DemoService.class);
        Iterator<DemoService> it = serviceLoader.iterator();
        while (it!=null && it.hasNext()) {
            DemoService demoService = it.next();
            System.out.println("class:"+demoService.getClass().getName()+"***"+demoService.sayHi("World"));
        }
    }
}
