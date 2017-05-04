package com.touch.service.impl;

import com.touch.dao.UserDao;
import com.touch.entity.User;
import com.touch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuxl@paxsz.com
 * @time 2017/5/4
 */
@SuppressWarnings("ALL")
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao; // 主数据源


    @Override
    public User findByName(String userName) {
        User user = userDao.findByName(userName);
        return user;
    }
}
