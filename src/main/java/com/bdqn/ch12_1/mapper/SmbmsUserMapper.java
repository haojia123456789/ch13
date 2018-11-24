package com.bdqn.ch12_1.mapper;

import com.bdqn.ch12_1.pojo.SmbmsUser;
import org.springframework.stereotype.Repository;

@Repository("userMapper")
public interface SmbmsUserMapper {
    SmbmsUser queryByName(String userCode);
}
