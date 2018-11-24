package com.bdqn.ch12_1.service;

import com.bdqn.ch12_1.pojo.SmbmsUser;

public interface SmbmsUserService {
    SmbmsUser queryByName(String userCode);
}
