package com.rea.springpractice;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("自定义测试类")
class SpringPracticeApplicationTests {

  @Test
  @DisplayName("自定义测试方法")
  public void test1() {
    System.out.println("测试方法");
  }

  @RepeatedTest(5)
  public void test2() {
    System.out.println("当前测试方法会被执行五次");
  }

  @BeforeEach
  public void beforeEach() {
    System.out.println("测试方法即将开始");
  }

  @AfterEach
  public void afterEach() {
    System.out.println("测试方法结束");
  }

  @BeforeAll
  static void beforeAll() {
    System.out.println("所有测试方法即将开始");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("所有测试方法结束");
  }

  @Test
  void contextLoads() {}
}
