package com.rea.springpractice.service.impl;

import com.rea.springpractice.mapper.SysUserMapper;
import com.rea.springpractice.model.SysUser;
import com.rea.springpractice.model.SysUserExample;
import com.rea.springpractice.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CRR
 */
@Service
public class SysUserServiceImpl implements SysUserService {
  @Autowired private SysUserMapper sysUserMapper;

  @Override
  public boolean login(String username, String password) {
    SysUserExample example = new SysUserExample();
    example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
    List<SysUser> sysUsers = sysUserMapper.selectByExample(example);
    return !sysUsers.isEmpty();
  }
}
