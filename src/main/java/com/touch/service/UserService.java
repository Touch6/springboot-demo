package com.touch.service;

import com.touch.entity.User;

/**
 * @author zhuxl@paxsz.com
 * @time 2017/5/4
 */
public interface UserService {
    /**
     * 根据用户名获取用户信息，包括从库的地址信息
     *
     * @param userName
     * @return
     */
    User findByName(String userName);
}
