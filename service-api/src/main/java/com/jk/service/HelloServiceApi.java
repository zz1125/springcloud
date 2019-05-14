
package com.jk.service;

import com.jk.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface HelloServiceApi {
//如果使用feign传递参数一定要加@RequestParam   基本的数据类型  string int
    //如果参数是一个对象请使用  @RequestBody

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    User helloUser(@RequestBody User user);
}
