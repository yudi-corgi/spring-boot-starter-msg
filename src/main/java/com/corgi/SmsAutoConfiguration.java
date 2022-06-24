package com.corgi;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;


/**
 * @author YUDI-Corgi
 * @description SMS 自动配置
 */
@Configuration
@ConditionalOnClass(SmsService.class)
@EnableConfigurationProperties(SmsProperties.class)
public class SmsAutoConfiguration {

    @Resource
    private SmsProperties smsProperties;

    @Bean
    @ConditionalOnMissingBean(SmsService.class)
    @ConditionalOnProperty(prefix = "sms", value = "enabled", havingValue = "true")
    public SmsService smsService() {
        // 可自定义其它对 SmsService 的初始化操作
        return new SmsService(smsProperties.getUrl(), smsProperties.getKeyId(),
                smsProperties.getKeySecret());
    }

}
