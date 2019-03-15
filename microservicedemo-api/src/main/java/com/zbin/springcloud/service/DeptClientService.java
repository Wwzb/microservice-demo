package com.zbin.springcloud.service;

import com.zbin.springcloud.entities.Dept;
import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * com.zbin.springcloud.service.DeptServiceClient
 *
 * @author Zbin
 * @date 2019/03/14
 */
@FeignClient(value = "MICROSERVICEDEMO-DEPT", fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {

  // 采用Feign我们就可以使用SpringMVC的注解来对服务进行绑定！
  @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
  Dept get(@PathVariable("id") long id);

  @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
  List<Dept> list();

  @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
  boolean add(Dept dept);
}