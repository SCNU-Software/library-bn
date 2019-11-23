package com.scnu.library.tools.swagger;

import com.scnu.library.tools.enums.commonEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author Fisher
 * @Date 2019/3/18 23:23
 * @Description Swagger API 文档数据自动生成
 **/

@Configuration
@EnableSwagger2
public class swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(commonEnum.PACKAGE_NAME))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(commonEnum.SWAGGER_TITLE)
                .description(commonEnum.SWAGGER_DESCRIPTION)
                .version(commonEnum.SWAGGER_VERSION)
                .build();
    }

}
