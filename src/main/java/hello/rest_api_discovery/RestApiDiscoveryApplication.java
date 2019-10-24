package hello.rest_api_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class RestApiDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiDiscoveryApplication.class, args);
	}

}
