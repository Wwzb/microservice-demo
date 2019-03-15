package com.zbin.springcloud.service;

import com.zbin.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * com.zbin.springcloud.service.DeptClientServiceFallBackFactory
 *
 * @author Zbin
 * @date 2019/03/15
 */
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {

  @Override
  public DeptClientService create(Throwable throwable) {
    return new DeptClientService() {
      @Override
      public Dept get(long id) {
        return new Dept().setId(id)
          .setName("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务provider已关闭")
          .setDbSource("no this database in MySQL");
      }

      @Override
      public List<Dept> list() {
        return null;
      }

      @Override
      public boolean add(Dept dept) {
        return false;
      }
    };
  }
}
