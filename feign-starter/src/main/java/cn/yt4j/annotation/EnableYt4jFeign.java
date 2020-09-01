package cn.yt4j.annotation;

import cn.yt4j.config.FeignConfig;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.lang.annotation.*;

/**
 * @author gyv12345@163.com
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@EnableFeignClients(basePackages = "cn.yt4j.api",defaultConfiguration = FeignConfig.class)
public @interface EnableYt4jFeign {
}
