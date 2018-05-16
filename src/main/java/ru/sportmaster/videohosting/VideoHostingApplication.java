package ru.sportmaster.videohosting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ru.sportmaster.videohosting.*")
public class VideoHostingApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoHostingApplication.class, args);
	}
}
