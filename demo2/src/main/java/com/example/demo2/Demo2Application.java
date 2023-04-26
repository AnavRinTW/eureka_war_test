package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@FeignClient(name = "demo1", path = "/demo1")
interface Demo1Feign {
	@GetMapping("/demo1")
	String getDemo1();
}

@SpringBootApplication
@EnableFeignClients
@RestController
public class Demo2Application {

	@Autowired
	private Demo1Feign demo1;

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@GetMapping("/demo2")
	public String getDemo2() {
		return "Demo1 says: " + demo1.getDemo1();
	}

}
