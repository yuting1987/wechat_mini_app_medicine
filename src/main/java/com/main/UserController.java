package com.main;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yuting on 2017/1/19.
 */
@RestController
@RequestMapping(value = "/api/account")     // 通过这里配置使下面的映射都在/users下，可去除
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user" , value = "用户信息实体对象", required = true, dataType = "User")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@RequestBody User user) {
        userRepository.save(new User(user.name , user.age));
        return "success";
    }

    @ApiOperation(value = "获取用户信息", notes = "根据姓名获取用户基本信息")
    @ApiImplicitParam(name = "name" , value = "姓名", required = true, dataType = "string")
    @RequestMapping(value = {"/getUserByName"}, method = RequestMethod.GET)
    public User getUserByName(@RequestBody String name) {
        User user = userRepository.findByName(name);
        return user;
    }
}
