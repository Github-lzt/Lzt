package com.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.hr.mapper")
public class OasysWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(OasysWebApplication.class, args);
	}

}
