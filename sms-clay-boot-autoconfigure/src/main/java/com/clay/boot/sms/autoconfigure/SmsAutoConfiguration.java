package com.clay.boot.sms.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.clay.boot.sms.autoconfigure.sender.AliSmsSender;

/**
 * @author lei
 */
@Configuration
@EnableConfigurationProperties(SmsProperties.class)
public class SmsAutoConfiguration {

    @Bean
    @ConditionalOnProperty(prefix = SmsProperties.PREFIX_ALIYUN, name = "sign-name")
    public SmsSender aliyunSmsSender(SmsProperties smsProperties) {
        SmsProperties.Aliyun aliyun = smsProperties.getAliyun();
        return new AliSmsSender(aliyun);
    }
}
