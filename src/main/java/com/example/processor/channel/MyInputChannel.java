package com.example.processor.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by ANTONIO on 13/06/2017.
 */
public interface MyInputChannel {

    String INPUT = "source";
    @Input(INPUT)
    SubscribableChannel source();
}
