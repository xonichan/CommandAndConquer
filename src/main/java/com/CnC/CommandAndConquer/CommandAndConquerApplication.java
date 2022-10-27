package com.CnC.CommandAndConquer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandAndConquerApplication {
	static final Logger logger =
			LoggerFactory.getLogger(CommandAndConquerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CommandAndConquerApplication.class, args);
		logger.info("Starting CommandAndConquerApplication.");
	}
}