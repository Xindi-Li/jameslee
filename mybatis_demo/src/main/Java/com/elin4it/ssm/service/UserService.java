package com.elin4it.ssm.service;

import com.elin4it.ssm.pojo.User;

import java.util.List;

/**
 * Created by lixindi on 2017/1/11.
 */
public interface UserService {
    List<User> findUser() throws Exception;
}
