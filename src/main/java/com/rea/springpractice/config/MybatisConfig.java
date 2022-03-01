package com.rea.springpractice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author CRR
 */
@Configuration
@MapperScan({"com.rea.springpractice.mapper", "com.rea.springpractice.model"})
public class MybatisConfig {}
