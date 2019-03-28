package com.test.controller;

import com.test.model.User;
import com.test.service.IUserService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("getUser")
    public  @ResponseBody
    List<User> useInfo(){
        User user=new User();
        user.setUsername("空姐");
        user.setPassword("123456");
        List<User> list=new ArrayList<User>();
        list.add(user);
        list.add(user);
        return list;
    }

    @Autowired
    private IUserService userService;

    Logger logger= Logger.getLogger(UserController.class);

    @RequestMapping("userInfo")
    @ResponseBody
    public User UserInfo(int id){
        logger.info("ip123"+"id:"+id);
        return userService.findUserByID(id);
    }
}
