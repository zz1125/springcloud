/**
 * Copyright (C), 2019, 金科教育
 * FileName: UserServiceApi
 * Author:   zyl
 * Date:     2019/5/13 15:19
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service;

import com.jk.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author zyl
 * @create 2019/5/13
 * @since 1.0.0
 */
public interface UserServiceApi {

    @RequestMapping(value = "/helloLiu",method = RequestMethod.POST)
    User helloUserLiu(@RequestBody User user);
}
