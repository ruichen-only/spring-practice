package com.rea.springpractice.service;

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
}
