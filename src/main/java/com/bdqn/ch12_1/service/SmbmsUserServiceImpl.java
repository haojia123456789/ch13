package com.bdqn.ch12_1.service;

import com.bdqn.ch12_1.mapper.SmbmsUserMapper;
import com.bdqn.ch12_1.pojo.SmbmsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class SmbmsUserServiceImpl
        implements  SmbmsUserService{
    @Autowired
    private SmbmsUserMapper userMapper;
    public SmbmsUser queryByName(String userCode) {
        SmbmsUser user=userMapper.queryByName(userCode);
        return user;
    }
}
