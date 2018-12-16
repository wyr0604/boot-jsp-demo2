package com.baizhi.wyr.service;

import com.baizhi.wyr.entity.TestUser;

import java.util.List;

public interface TestUserService {
    void addUser(TestUser user);
    List<TestUser> queryAll();
}
