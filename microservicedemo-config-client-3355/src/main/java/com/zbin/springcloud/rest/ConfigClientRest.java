package com.zbin.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.zbin.springcloud.rest.ConfigClientRest
 *
 * @author Zbin
 * @date 2019/03/19
 */
@RestController
public class ConfigClientRest {

  @Value("${spring.application.name}")
  private String applicationName;

  @Value("${eureka.client.service-url.defaultZone}")
  private String eurekaServers;

  @Value("${server.port}")
  private String port;

  @RequestMapping("/config")
  public String getConfig() {
    return "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: "
      + port;
  }

}
