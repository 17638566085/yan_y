package cn.yanyong.testboot.mapper;

import cn.yanyong.testboot.entity.User;

import java.util.List;

/**
 * 2018/9/28$ {Yan_y}
 */
public interface UserMapper {

    List<User> getUserLogin(User user);
}
