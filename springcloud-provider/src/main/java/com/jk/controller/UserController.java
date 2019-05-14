
package com.jk.controller;

import com.jk.model.User;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {




    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public User queryUser(@RequestBody  User user){
        System.out.println(user);
        User u=new User();
        u.setUserName("张三");
        u.setUserId(2);
        return u;
    }

    @RequestMapping(value = "/helloLiu",method = RequestMethod.POST)
    public User helloLiu(@RequestBody  User user){
        System.out.println(user);
        User u=new User();
        u.setUserName("张三");
        u.setUserId(2);
        return u;
    }


}
