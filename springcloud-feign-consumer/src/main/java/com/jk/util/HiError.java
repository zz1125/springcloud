
package com.jk.util;

import com.jk.model.User;
import com.jk.service.HelloService;
import org.springframework.stereotype.Component;


@Component
public class HiError implements HelloService{

    @Override
    public String hello(String name) {
        return "sorry I am dont like you";
    }

    @Override
    public User helloUser(User user) {
        User u=new User();
        u.setUserName("i am sb");
        u.setUserId(1);
        return u;
    }
}
