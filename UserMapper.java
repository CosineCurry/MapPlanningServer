package com.demo.common.dao;

import com.demo.common.domain.User;

import java.util.List;

/**
 * Created by Simon on 16/6/28.
 */
public interface UserMapper {
    User selectByExample(User user);

    int insertUser(User user);

    List<User> selectByMobilePhone(String mobilePhone);

    User selectById(Integer id);

    List<User> selectAllUser();

    int updateUser(User user);
}
