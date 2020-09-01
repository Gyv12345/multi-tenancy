package cn.yt4j.svc.feign;

import cn.yt4j.annotation.EnableYsgDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gyv12345@163.com
 */
@EnableDiscoveryClient
@EnableYsgDataSource
@SpringBootApplication
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
