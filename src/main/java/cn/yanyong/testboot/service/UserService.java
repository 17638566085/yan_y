package cn.yanyong.testboot.service;

import cn.yanyong.testboot.entity.User;

import java.util.List;

/**
 * 2018/9/28$ {Yan_y}
 */
public interface UserService {

    List<User> findUserLogin(User user);

}
