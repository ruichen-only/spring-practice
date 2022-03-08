package com.rea.springpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author CRR
 */
@RestController
public class EmailController {
  @Autowired private JavaMailSender jms;

  @Value("${spring.mail.username}")
  private String from;

  @Autowired private TemplateEngine templateEngine;

  @RequestMapping("sendSimpleEmail")
  public String sendSimpleEmail() {
    try {
      SimpleMailMessage message = new SimpleMailMessage();
      message.setFrom(from);
      // 接收地址
      message.setTo("888888@qq.com");
      // 标题
      message.setSubject("一封简单的邮件");
      // 内容
      message.setText("使用Spring Boot发送简单邮件。");
      jms.send(message);
      return "发送成功";
    } catch (Exception e) {
      e.printStackTrace();
      return e.getMessage();
    }
  }

  @RequestMapping("/sendHtmlEmail")
  public String sendHtmlEmail() {
    MimeMessage mimeMessage = null;
    try {
      mimeMessage = jms.createMimeMessage();
      MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
      helper.setFrom(from);
      // 接收地址
      helper.setTo("888888@qq.com");
      // 标题
      helper.setSubject("一封HTML格式的邮件");
      // 带HTML格式的内容
      helper.setText("<p style='color:#6db33f'>使用Spring Boot发送HTML格式邮件。</p>", true);
      jms.send(mimeMessage);
      return "发送成功";
    } catch (MessagingException e) {
      e.printStackTrace();
      return e.getMessage();
    }
  }

  @RequestMapping("/sendAttachmentsMail")
  public String sendAttachmentsMail() {
    MimeMessage mimeMessage = null;
    try {
      mimeMessage = jms.createMimeMessage();
      MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
      helper.setFrom(from);
      helper.setTo("888888@qq.com");
      helper.setSubject("一封带附件的邮件");
      helper.setText("详情参见附件内容!");
      // 传入附件
      FileSystemResource file =
          new FileSystemResource(new File("C:\\Users\\CRR\\Desktop\\录用条件确认书.docx"));
      helper.addAttachment("录用条件确认书.docx", file);
      jms.send(mimeMessage);
      return "发送成功";
    } catch (MessagingException e) {
      e.printStackTrace();
      return e.getMessage();
    }
  }

  @RequestMapping("/sendInlineMail")
  public String sendInlineMail() {
    MimeMessage mimeMessage = null;
    try {
      mimeMessage = jms.createMimeMessage();
      MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
      helper.setFrom(from);
      helper.setTo("888888@qq.com");
      helper.setSubject("一封带静态资源的邮件");
      // 发送带静态资源的邮件其实就是在发送 HTML 邮件的基础上嵌入静态资源（比如图片），
      // 嵌入静态资源的过程和传入附件类似，唯一的区别在于需要标识资源的 cid：
      helper.setText("<html><body>博客图：<img src='cid:img'/></body></html>", true);
      // 传入附件
      FileSystemResource file =
          new FileSystemResource(new File("C:\\Users\\CRR\\Desktop\\身份证人像面.jpg"));
      helper.addInline("img", file);
      jms.send(mimeMessage);
      return "发送成功";
    } catch (MessagingException e) {
      e.printStackTrace();
      return e.getMessage();
    }
  }

  @RequestMapping("/sendTemplateEmail")
  public String sendTemplateEmail(String code) {
    MimeMessage mimeMessage = null;
    try {
      mimeMessage = jms.createMimeMessage();
      MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
      helper.setFrom(from);
      helper.setTo("888888@qq.com");
      helper.setSubject("邮件摸板测试");
      // 处理邮件模板
      Context context = new Context();
      context.setVariable("code", code);
      String template = templateEngine.process("emailTemplate", context);
      helper.setText(template, true);
      jms.send(mimeMessage);
      return "发送成功";
    } catch (MessagingException e) {
      e.printStackTrace();
      return e.getMessage();
    }
  }
}
