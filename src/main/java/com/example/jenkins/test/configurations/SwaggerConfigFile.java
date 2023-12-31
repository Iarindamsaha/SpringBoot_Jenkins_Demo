package com.example.jenkins.test.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfigFile {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.jenkins.test"))
                .paths(PathSelectors.any())
                .build().apiInfo(metadata());
    }

    private ApiInfo metadata(){
        return new ApiInfoBuilder()
                .title("Arindam Saha - Jenkins CI/CD Test Project")
                .description("-- This is Just A Test Project For Jenkins Testing --")
                .version("1.1.0")
                .license("Apache 2.0")
                .licenseUrl("https://www.apache.org/licenses/LINCESE-2.0\"")
                .contact(new
                        Contact
                        ("Arindam Saha","https://github.com/Iarindamsaha","arindamofficial15@gmail.com"))
                .build();
    }
}
