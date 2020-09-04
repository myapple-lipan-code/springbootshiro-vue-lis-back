package com.callray.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.callray.example.dao.LoginDao;
import com.callray.example.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * @author administrator
 * @date 2020/9/4 16:27
 */
@Service
public class LoginServiceImpl implements LoginService {

    private LoginDao loginDao;
    @Override
    public JSONObject getUser(String username, String password) {
        return loginDao.getUser(username,password);
    }
}
