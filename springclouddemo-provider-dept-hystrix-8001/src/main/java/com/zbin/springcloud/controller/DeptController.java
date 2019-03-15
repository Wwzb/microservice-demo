package com.zbin.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zbin.springcloud.entities.Dept;
import com.zbin.springcloud.service.DeptService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.zbin.springcloud.controller.DeptController
 *
 * @author Zbin
 * @date 2019/03/13
 */
@RestController
public class DeptController {

  @Resource
  private DeptService deptService;

  @PostMapping("/dept/add")
  public boolean add(@RequestBody Dept dept) {
    return deptService.add(dept);
  }

  @GetMapping("/dept/get/{id}")
  @HystrixCommand(fallbackMethod = "processHystrix_Get")
  public Dept get(@PathVariable Long id) {
    Dept dept = deptService.get(id);
    if (dept == null) {
      throw new RuntimeException("id:" + id + "没有对应的信息");
    }
    return dept;
  }

  @GetMapping("/dept/list")
  public List<Dept> list() {
    return deptService.list();
  }

  public Dept processHystrix_Get(@PathVariable("id") Long id) {
    return new Dept().setId(id).setName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
      .setDbSource("no this database in MySQL");
  }
}
