package com.zbin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * com.zbin.springcloud.EurekaServer7001_App
 *
 * @author Zbin
 * @date 2019/03/14
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001_App {

  public static void main(String[] args) {
    SpringApplication.run(EurekaServer7001_App.class, args);
  }

}
