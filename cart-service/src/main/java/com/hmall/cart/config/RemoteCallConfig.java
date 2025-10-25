package com.hmall.cart.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mr.M
 * @version 1.0
 * @description RestTemplate配置类
 * @date 2024/8/2 19:46
 */

@Configuration
public class RemoteCallConfig {

 @Bean
 @LoadBalanced
 public RestTemplate restTemplate() {
  return new RestTemplate();
 }
}