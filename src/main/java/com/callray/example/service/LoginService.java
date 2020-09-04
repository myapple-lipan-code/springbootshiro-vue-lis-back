package com.callray.example.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author administrator
 * @date 2020/9/4 16:21
 */
public interface LoginService {
    JSONObject getUser(String loginName, String password);
}
