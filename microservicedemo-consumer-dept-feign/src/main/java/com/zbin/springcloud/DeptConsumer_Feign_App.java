package com.zbin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * com.zbin.springcloud.DeptConsumer_Feign_App
 *
 * @author Zbin
 * @date 2019/03/13
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.zbin.springcloud")
public class DeptConsumer_Feign_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptConsumer_Feign_App.class, args);
  }

}
