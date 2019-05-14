package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //向服务中心注册
@EnableHystrix //注解开启Hystrix  断路器
public class SpringcloudRibbonConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRibbonConsumerApplication.class, args);
    }



    @Bean
    @LoadBalanced  //开启负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
