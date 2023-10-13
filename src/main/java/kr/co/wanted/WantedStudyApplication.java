package kr.co.wanted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ServletComponentScan
public class WantedStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(WantedStudyApplication.class, args);
	}

}