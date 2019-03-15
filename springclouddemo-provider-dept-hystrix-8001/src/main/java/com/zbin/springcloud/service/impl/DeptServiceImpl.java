package com.zbin.springcloud.service.impl;

import com.zbin.springcloud.dao.DeptDao;
import com.zbin.springcloud.entities.Dept;
import com.zbin.springcloud.service.DeptService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * com.zbin.springcloud.service.impl.DeptServiceImpl
 *
 * @author Zbin
 * @date 2019/03/13
 */
@Service
public class DeptServiceImpl implements DeptService {

  @Resource
  private DeptDao deptDao;

  @Override
  public boolean add(Dept dept) {
    return deptDao.addDept(dept);
  }

  @Override
  public Dept get(Long id) {
    return deptDao.findById(id);
  }

  @Override
  public List<Dept> list() {
    return deptDao.findAll();
  }
}
