package com.zbin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * com.zbin.springcloud.Zuul_9527_StartSpringCloudApp
 *
 * @author Zbin
 * @date 2019/03/19
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp {

  public static void main(String[] args) {
    SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
  }

}
