package cn.yt4j.datasource;

import cn.yt4j.annotation.EnableYt4jDataSource;
import cn.yt4j.annotation.EnableYt4jFeign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gyv12345@163.com
 */
@EnableDiscoveryClient
@EnableYt4jFeign
@EnableYt4jDataSource
@SpringBootApplication
public class DataSourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataSourceApplication.class,args);
    }
}
