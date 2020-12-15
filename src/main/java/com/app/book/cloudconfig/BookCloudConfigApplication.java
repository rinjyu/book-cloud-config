package com.app.book.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BookCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookCloudConfigApplication.class, args);
    }

}
