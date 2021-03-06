package com.rea.springpractice.controller;

import com.rea.springpractice.bean.Account;
import com.rea.springpractice.component.GlobalProperties;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CRR
 */
@Controller
@Api(value = "HelloController")
public class IndexController {

  @Autowired private GlobalProperties globalProperties;

  @ApiIgnore
  @RequestMapping("/index")
  String index() {
    return globalProperties.getProjectName() + "——" + globalProperties.getProjectAuthor();
  }

  @ApiIgnore
  @RequestMapping("/account")
  String account(Model m) {
    List<Account> list = new ArrayList<>();
    list.add(new Account("rea", "睿", "e10adc3949ba59abbe56e", "超级管理员", "17777777777"));
    list.add(new Account("Mike", "麦克", "e10adc3949ba59abbe56e", "管理员", "13444444444"));
    list.add(new Account("Jane", "简", "e10adc3949ba59abbe56e", "运维人员", "18666666666"));
    list.add(new Account("Maria", "玛利亚", "e10adc3949ba59abbe56e", "清算人员", "19999999999"));
    m.addAttribute("accountList", list);
    return "account";
  }
}
