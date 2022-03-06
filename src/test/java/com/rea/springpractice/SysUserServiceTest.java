package com.rea.springpractice;

import com.rea.springpractice.model.SysUser;
import com.rea.springpractice.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author CRR
 */
@SpringBootTest
public class SysUserServiceTest {
  @Autowired SysUserService sysUserService;

  @Test
  void test() {
    SysUser user = sysUserService.getUserByName("zhangsan");
    System.out.println(user);
  }
}
