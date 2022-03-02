package com.rea.springpractice.config;

import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.CacheKeyPrefix;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;

/**
 * @author CRR
 */
@Configuration
public class RedisCacheConfig {

  /**
   * 配置缓存管理器
   *
   * @param factory Redis 线程安全连接工厂
   * @return 缓存管理器
   */
  @Bean
  public CacheManager cacheManager(RedisConnectionFactory factory) {
    // 生成两套默认配置，通过 Config 对象即可对缓存进行自定义配置
    RedisCacheConfiguration cacheConfig =
        RedisCacheConfiguration.defaultCacheConfig()
            .entryTtl(Duration.ofMinutes(10))
            .computePrefixWith(CacheKeyPrefix.prefixed("cache:"))
            .disableCachingNullValues()
            .serializeKeysWith(keyPair())
            .serializeValuesWith(valuePair());
    return RedisCacheManager.builder(factory).withCacheConfiguration("user", cacheConfig).build();
  }

  /**
   * 配置键序列化
   *
   * @return StringRedisSerializer
   */
  private RedisSerializationContext.SerializationPair<String> keyPair() {
    return RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer());
  }

  /**
   * 配置值序列化，使用 GenericJackson2JsonRedisSerializer 替换默认序列化
   *
   * @return GenericJackson2JsonRedisSerializer
   */
  private RedisSerializationContext.SerializationPair<Object> valuePair() {
    return RedisSerializationContext.SerializationPair.fromSerializer(
        new GenericJackson2JsonRedisSerializer());
  }
}
