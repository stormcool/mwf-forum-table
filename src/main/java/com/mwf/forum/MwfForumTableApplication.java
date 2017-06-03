package com.mwf.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan(basePackages = { "com.mwf.forum.model" }) 
//@EnableJpaRepositories(basePackages = { "com.mwf.forum.repository" })
public class MwfForumTableApplication {

	public static void main(String[] args) {
		SpringApplication.run(MwfForumTableApplication.class, args);
	}
}
