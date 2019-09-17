package com.hr.service.impl;


import com.hr.entity.AoaUser;
import com.hr.mapper.AoaUserMapper;
import com.hr.service.AoaUserService;

public class AoaUserServiceImpl implements AoaUserService {

    private AoaUserMapper aoaUserMapper;

    @Override
    public AoaUser login(AoaUser user) {
        return aoaUserMapper.login(user);
    }
}
