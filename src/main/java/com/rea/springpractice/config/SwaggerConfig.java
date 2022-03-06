package com.rea.springpractice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author CRR
 */
@Configuration
@EnableWebMvc
public class SwaggerConfig {
  @Bean
  public Docket buildDocket() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(buildApiInf())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.rea.springpractice.controller"))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo buildApiInf() {
    return new ApiInfoBuilder()
        .title("系统API文档")
        //        .contact(new Contact("mrbird", "https://mrbird.cc", "852252810@qq.com"))
        .version("1.0")
        .build();
  }
}
