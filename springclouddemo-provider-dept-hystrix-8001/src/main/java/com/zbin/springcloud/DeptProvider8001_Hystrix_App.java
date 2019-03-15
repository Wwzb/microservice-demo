package com.zbin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * com.zbin.springcloud.DeptProvider8001_Hystrix_App
 *
 * @author Zbin
 * @date 2019/03/13
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class DeptProvider8001_Hystrix_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
  }

}
