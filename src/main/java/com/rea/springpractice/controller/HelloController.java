package com.rea.springpractice.controller;

import com.rea.springpractice.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CRR
 */
@RestController
public class HelloController {
  @Autowired private SysUserService sysUserService;

  @RequestMapping("/hello")
  public String helloWorld() {
    return "helloWorld";
  }

  @RequestMapping("/login")
  public String login(String username, String password) {
    if (sysUserService.login(username, password)) {
      return "登录成功";
    }
    return "账号或密码不正确";
  }
}
