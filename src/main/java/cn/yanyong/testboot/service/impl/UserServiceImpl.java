package cn.yanyong.testboot.service.impl;

import cn.yanyong.testboot.entity.User;
import cn.yanyong.testboot.mapper.UserMapper;
import cn.yanyong.testboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2018/9/28$ {Yan_y}
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findUserLogin(User user) {
        return userMapper.getUserLogin(user);
    }
}
