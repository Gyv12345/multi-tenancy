package cn.yt4j.annotation;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import cn.yt4j.DynamicDataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author gyv12345@163.com
 */
@EnableBinding(Sink.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@EnableAutoConfiguration(exclude = {DruidDataSourceAutoConfigure.class})
@Import(DynamicDataSourceAutoConfiguration.class)
public @interface EnableYt4jDataSource {
    
}
