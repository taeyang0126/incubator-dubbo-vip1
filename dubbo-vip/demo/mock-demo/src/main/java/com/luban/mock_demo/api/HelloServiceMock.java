package com.luban.mock_demo.api;

import com.luban.mock_demo.api.HelloService;

/**
 * *************书山有路勤为径***************
 * 鲁班学院
 * 往期资料加木兰老师  QQ: 2746251334
 * VIP课程加安其拉老师 QQ: 3164703201
 * 讲师：周瑜老师
 * *************学海无涯苦作舟***************
 */
public class HelloServiceMock implements HelloService {

    @Override
    public String sayHello(String username) {
        return "mock " + username;
    }
}
