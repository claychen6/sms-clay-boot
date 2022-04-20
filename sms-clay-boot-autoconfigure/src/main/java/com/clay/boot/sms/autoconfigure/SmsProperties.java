package com.clay.boot.sms.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * @author lei
 */
@Data
@ConfigurationProperties(prefix = SmsProperties.PREFIX)
public class SmsProperties {

    static final String PREFIX = "sms";
    static final String PREFIX_ALIYUN = "sms.aliyun";

    private Aliyun aliyun;

    private boolean enabled;

    @Data
    public static class Aliyun {

        private String signName;

        private String accessKeyId;

        private String accessKeySecret;
    }
}
