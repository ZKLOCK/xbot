package com.tao.xbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableAsync
@EnableScheduling
public class XbotApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(XbotApplication.class, args);
        System.out.println("""
            
            ========================================
            外贸应用启动成功！
            API 文档: http://localhost:8080/doc.html
            健康检查: http://localhost:8080/actuator/health
            ========================================
            """);
    }
}