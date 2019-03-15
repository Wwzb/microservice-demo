package com.zbin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * com.zbin.springcloud.DeptConsumer_Dashboard_App
 *
 * @author Zbin
 * @date 2019/03/15
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_Dashboard_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptConsumer_Dashboard_App.class, args);
  }
}
