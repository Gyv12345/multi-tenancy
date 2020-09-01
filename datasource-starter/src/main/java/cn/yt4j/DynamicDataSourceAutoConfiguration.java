package cn.yt4j;

import cn.yt4j.config.HeardDsProcessor;
import cn.yt4j.config.JdbcDataSourceProperties;
import cn.yt4j.config.JdbcDynamicDataSourceProvider;
import cn.yt4j.dynamic.DynamicMqDataSource;
import com.baomidou.dynamic.datasource.processor.DsProcessor;
import com.baomidou.dynamic.datasource.provider.DynamicDataSourceProvider;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author gyv12345@163.com
 */
@Configuration
@AllArgsConstructor
@AutoConfigureAfter(DataSourceAutoConfiguration.class)
@EnableConfigurationProperties(JdbcDataSourceProperties.class)
public class DynamicDataSourceAutoConfiguration {
    private final JdbcDataSourceProperties properties;

    @Bean
    public DynamicDataSourceProvider dynamicDataSourceProvider() {
        return new JdbcDynamicDataSourceProvider(properties);
    }

    @Bean
    public DsProcessor dsProcessor() {
        return new HeardDsProcessor();
    }

    @Bean
    public DynamicMqDataSource source(){
        return new DynamicMqDataSource();
    }
}
