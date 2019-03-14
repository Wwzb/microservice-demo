package com.zbin.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * com.zbin.myrule.MyRule
 *
 * @author Zbin
 * @date 2019/03/14
 */
@Configuration
public class MyRule {

  @Bean
  public IRule myselfRule() {
    return new RandomRule();
  }
}
