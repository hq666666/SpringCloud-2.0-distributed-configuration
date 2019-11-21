package com.person.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClinetConfig {
    /**
     * 手动刷新：
     *     01：需要依赖actuator监控中心jar包；
     *     02：在本地的配置文件中配置开启端点；
     *     03：需要在对应需要刷新配置文件信息(git库的配置文件信息)放入接口上配置@RefreshScope注解
     *     04：需要自己手动刷新调用对应的接口:http://localhost:8001/actuator/refresh （post请求）
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ClinetConfig.class,args);
    }
}
