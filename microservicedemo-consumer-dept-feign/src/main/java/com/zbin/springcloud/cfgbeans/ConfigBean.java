package com.zbin.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * com.zbin.springcloud.cfgbeans.ConfigBean
 *
 * @author Zbin
 * @date 2019/03/13
 */
@Configuration
public class ConfigBean {

  @Bean
  @LoadBalanced
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }
}
