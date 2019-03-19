package com.zbin.springcloud.service;

import com.zbin.springcloud.entities.Dept;
import java.util.List;

/**
 * com.zbin.springcloud.service.DeptService
 *
 * @author Zbin
 * @date 2019/03/13
 */

public interface DeptService {

  public boolean add(Dept dept);

  public Dept get(Long id);

  public List<Dept> list();

}
