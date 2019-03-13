package com.zbin.springcloud.entities;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * com.zbin.springcloud.entities.Dept
 *
 * @author Zbin
 * @date 2019/03/13
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Dept implements Serializable {

  public Dept(String name) {
    this.name = name;
  }

  private Long id;

  private String name;

  private String dbSource;

}
