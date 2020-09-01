package cn.yt4j.datasource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author gyv12345@163.com
 */
@Configuration
@EnableSwagger2
public class SwaggerAutoConfig {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(ApiInfo.DEFAULT)
        .select()
        .apis(RequestHandlerSelectors.basePackage("cn.yt4j.datasource.controller"))
        .paths(PathSelectors.any())
        .build();
  }
}