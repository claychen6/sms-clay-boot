package com.clay.boot.sms.autoconfigure.sender;

import com.clay.boot.sms.autoconfigure.SmsSender;

/**
 * @author lei
 */
public class AliSmsSender implements SmsSender {

    @Override
    public void send() {
        System.out.println("test");
    }
}
