package com.person.client.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取git配置文件信息
 */
@RestController
@RefreshScope //此注解开启手动刷新配置文件
public class GetConfigInfo {

    //获取git配置文件的信息
    @Value("${testIP}")
    private String  info;

    @RequestMapping("/info")
    public String getInfo(){
       return  info;
    }
}
