package com.rea.springpractice.service;

import com.rea.springpractice.model.SysUser;

/**
 * @author CRR
 */
public interface SysUserService {

  /**
   * 登录功能
   *
   * @param username 用户名
   * @param password 密码
   * @return 调用认证中心返回结果
   */
  boolean login(String username, String password);

  /**
   * 根据用户名取得用户信息
   *
   * @param username 用户名
   */
  SysUser getUserByName(String username);
}
