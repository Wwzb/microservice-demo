package com.zbin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * com.zbin.springcloud.DeptProvider8003_App
 *
 * @author Zbin
 * @date 2019/03/13
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8003_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptProvider8003_App.class, args);
  }

}
