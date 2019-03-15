package com.zbin.springcloud.controller;

import com.zbin.springcloud.entities.Dept;
import com.zbin.springcloud.service.DeptClientService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.zbin.springcloud.controller.DeptController_Consumer
 *
 * @author Zbin
 * @date 2019/03/13
 */
@RestController
public class DeptController_Consumer {

  @Resource
  private DeptClientService deptClientService;

  @RequestMapping(value = "/consumer/dept/get/{id}")
  public Dept get(@PathVariable("id") Long id) {
    return this.deptClientService.get(id);
  }

  @RequestMapping(value = "/consumer/dept/list")
  public List<Dept> list() {
    return this.deptClientService.list();
  }

  @RequestMapping(value = "/consumer/dept/add")
  public Object add(Dept dept) {
    return this.deptClientService.add(dept);
  }
}
