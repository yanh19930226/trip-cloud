package com.trip.auth.config;

import com.trip.auth.interceptor.LoginInterceptor;
import com.trip.auth.util.SpringContextUtil;
import com.trip.redis.utils.RedisCache;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
/**
 * \@Import 注解等同于以前 xml 文件中的 \<import resource="applicationContext.xml"/>
 */
@Import(WebConfig.class)
@EnableConfigurationProperties(JwtProperties.class)
public class TripCommonJwtAutoConfiguration {

    @Bean
    public LoginInterceptor loginInterceptor(RedisCache redisCache, JwtProperties jwtProperties) {
        return new LoginInterceptor(redisCache, jwtProperties);
    }

    @Bean
    public SpringContextUtil springContextUtil() {
        return new SpringContextUtil();
    }
}
