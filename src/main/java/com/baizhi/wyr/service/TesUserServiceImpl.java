package com.baizhi.wyr.service;

import com.baizhi.wyr.entity.TestUser;
import com.baizhi.wyr.mapper.TestUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;
@Service("testUserService")
@MapperScan("com.baizhi.wyr.mapper")
public class TesUserServiceImpl implements TestUserService {
    @Autowired
    private TestUserMapper testUserMapper;
    @Override
    public void addUser(TestUser user) {
        testUserMapper.insert(user);
        //我只是想要测试一次
    }

    @Override
    public List<TestUser> queryAll() {
        return testUserMapper.selectAll();
    }
}
