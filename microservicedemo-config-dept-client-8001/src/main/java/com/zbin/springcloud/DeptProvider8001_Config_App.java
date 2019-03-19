package com.zbin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * com.zbin.springcloud.DeptProvider8001_App
 *
 * @author Zbin
 * @date 2019/03/13
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8001_Config_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptProvider8001_Config_App.class, args);
  }

}
