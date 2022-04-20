package com.clay.boot.sms.autoconfigure.sender;

import com.clay.boot.sms.autoconfigure.SmsProperties;
import com.clay.boot.sms.autoconfigure.SmsSender;

/**
 * @author lei
 */
public class AliSmsSender implements SmsSender {

    public AliSmsSender(SmsProperties.Aliyun aliyun) {
        System.out.println(aliyun);
    }

    @Override
    public void send() {
        System.out.println("test");
    }
}
