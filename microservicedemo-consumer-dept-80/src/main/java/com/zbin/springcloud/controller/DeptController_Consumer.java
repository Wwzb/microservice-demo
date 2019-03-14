package com.zbin.springcloud.controller;

import com.zbin.springcloud.entities.Dept;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * com.zbin.springcloud.controller.DeptController_Consumer
 *
 * @author Zbin
 * @date 2019/03/13
 */
@RestController
public class DeptController_Consumer {

  private static final String REST_URL_PREFIX = "http://MICROSERVICEDEMO-DEPT";

  @Resource
  private RestTemplate restTemplate;

  @RequestMapping("/consumer/dept/add")
  public boolean add(Dept dept) {
    return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
  }

  @GetMapping("/consumer/dept/get/{id}")
  public Dept get(@PathVariable Long id) {
    return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
  }

  @SuppressWarnings("unchecked")
  @GetMapping("/consumer/dept/list")
  public List<Dept> list(Dept dept) {
    return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
  }
}
