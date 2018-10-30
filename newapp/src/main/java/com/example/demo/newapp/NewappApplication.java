package com.example.demo.newapp;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.elastic.ElasticMeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewappApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewappApplication.class, args);
	}
}
