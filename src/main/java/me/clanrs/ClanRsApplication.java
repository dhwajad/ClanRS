package me.clanrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class ClanRsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClanRsApplication.class, args);
	}
}
