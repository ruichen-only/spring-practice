package com.rea.springpractice;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author CRR
 */
public class MybatisGenerator {
  /** 当生成的代码重复时，覆盖原代码 */
  private static final boolean OVERWRITE = true;

  public static void main(String[] args) throws Exception {
    // MBG 执行过程中的警告信息
    List<String> warnings = new ArrayList<>();
    // 读取我们的 MBG 配置文件
    InputStream is = MybatisGenerator.class.getResourceAsStream("/generatorConfig.xml");
    ConfigurationParser cp = new ConfigurationParser(warnings);
    Configuration config = cp.parseConfiguration(is);
    if (is != null) {
      is.close();
    }
    DefaultShellCallback callback = new DefaultShellCallback(OVERWRITE);
    // 创建 MBG
    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
    // 执行生成代码
    myBatisGenerator.generate(null);
    // 输出警告信息
    warnings.forEach(System.out::println);
  }
}
