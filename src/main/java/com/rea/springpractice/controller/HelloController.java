package com.rea.springpractice.controller;

import com.rea.springpractice.model.SysUser;
import com.rea.springpractice.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author CRR
 */
@Api(value = "HelloController")
@RestController
public class HelloController {
  @Autowired private SysUserService sysUserService;

  @ApiIgnore
  @RequestMapping("/hello")
  public String helloWorld() {
    return "helloWorld";
  }

  @ApiOperation(value = "登录账号")
  @ApiImplicitParams({
    @ApiImplicitParam(name = "username", value = "用户名称", required = true),
    @ApiImplicitParam(name = "password", value = "用户密码", required = true)
  })
  @RequestMapping("/login")
  public String login(String username, String password) {
    if (sysUserService.login(username, password)) {
      return "登录成功";
    }
    return "账号或密码不正确";
  }

  @ApiOperation(value = "根据用户名称取得用户信息")
  @ApiImplicitParam(name = "username", value = "用户名称", required = true)
  @RequestMapping("/getUserByName")
  @ResponseBody
  public SysUser getUserByName(String username) {
    return sysUserService.getUserByName(username);
  }
}
