package com.wo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * SpringBootStart
 *
 * @author xumj
 * @date 2020/8/20 10:08
 */
@EnableConfigServer
@SpringBootApplication
public class WoConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(WoConfigApplication.class, args);
    }
}
