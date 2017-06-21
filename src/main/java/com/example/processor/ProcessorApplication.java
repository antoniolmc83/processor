package com.example.processor;

import com.example.processor.channel.MyProcessorChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@EnableBinding(MyProcessorChannel.class)
@SpringBootApplication
public class ProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessorApplication.class, args);
	}

	@Transformer(inputChannel = MyProcessorChannel.INPUT, outputChannel = MyProcessorChannel.OUTPUT)
	public Object transform(Long timestamp){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String date = dateFormat.format(timestamp);
		System.out.println("Processor " + date);
		return date;
	}

}
