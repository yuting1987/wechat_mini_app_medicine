package com.api;

import com.account.User;
import com.dao.UserDao;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yuting on 2017/1/19.
 */

@RestController
@RequestMapping(value = "/api/account")     // 通过这里配置使下面的映射都在/users下，可去除
public class UserController {

    @Autowired
    private UserDao userRepository;

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户信息实体对象", required = true, dataType = "User")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        userRepository.save(new User(user.name, user.age));
        return userRepository.findByName(user.name);
    }

    @ApiOperation(value = "获取用户信息", notes = "根据姓名获取用户基本信息")
    @RequestMapping(value = "/getUserByName", method = RequestMethod.GET)
    public String getUserByName(@ApiParam(name = "name", value = "姓名", required = true) @RequestParam String name, @ApiParam(name = "id", value = "id", required = true) @RequestParam int id) {
//        userRepository.findByName(name);
        return name + id;
    }
}
