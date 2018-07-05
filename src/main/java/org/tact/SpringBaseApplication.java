package org.tact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBaseApplication.class, args);
	}
}
