package com.callray.example.dao;

import com.alibaba.fastjson.JSONObject;

/**
 * @author administrator
 * @date 2020/9/4 15:58
 */
public interface LoginDao {

    JSONObject getUser(String username, String password);
}
