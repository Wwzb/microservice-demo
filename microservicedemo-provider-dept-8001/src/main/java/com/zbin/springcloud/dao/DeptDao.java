package com.zbin.springcloud.dao;

import com.zbin.springcloud.entities.Dept;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * com.zbin.springcloud.dao.DeptDao
 *
 * @author Zbin
 * @date 2019/03/13
 */
@Mapper
public interface DeptDao {

  public boolean addDept(Dept dept);

  public Dept findById(Long id);

  public List<Dept> findAll();
}
