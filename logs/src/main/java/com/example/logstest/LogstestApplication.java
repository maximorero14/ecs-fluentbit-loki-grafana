package com.example.logstest;

import com.example.logstest.config.CustomExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerExceptionResolver;

@SpringBootApplication
@Slf4j
public class LogstestApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(LogstestApplication.class, args);
		Integer i = 1;
		while (true){
			MDC.put("trace_id", i.toString());
			log.info("esto es un log de test");
			Thread.sleep(1000);
			i = i + 1;
		}
	}

	@Bean
	public HandlerExceptionResolver customExceptionHandler() {
		return new CustomExceptionHandler();
	}

}
