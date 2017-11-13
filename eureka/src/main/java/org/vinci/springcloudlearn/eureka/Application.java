package org.vinci.springcloudlearn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by XizeTian on 2017/11/9.
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
