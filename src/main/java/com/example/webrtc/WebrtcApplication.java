package com.example.webrtc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;


/**
 * @author ghy
 */
@SpringBootApplication
public class WebrtcApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebrtcApplication.class, args);
	}
}
