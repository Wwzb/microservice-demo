package com.zbin.springcloud.controller;

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
  public Dept get(@PathVariable Long id) {
    return deptService.get(id);
  }

  @GetMapping("/dept/list")
  public List<Dept> list() {
    return deptService.list();
  }
}
