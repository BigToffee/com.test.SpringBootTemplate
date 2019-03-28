package com.test.service.impl;

import com.test.mapper.UserMapper;
import com.test.model.User;
import com.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUserByID(int id) {
        return userMapper.findByID(id);
    }
}
