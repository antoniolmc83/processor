package com.example.processor.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by ANTONIO on 13/06/2017.
 */
public interface MyOutputChannel {
    String OUTPUT = "producer";

    @Output(OUTPUT)
    MessageChannel producerChannel();
}
