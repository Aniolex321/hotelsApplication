package pl.franek.test.hotel.config;

import org.springframework.context.annotation.*;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    // this will NOT work because springfox is an unmaintained piece of ****;
    // see following issue: https://github.com/springfox/springfox/issues/3934
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("pl.edu.tm1.hotelsapplication"))
                .build()
                .useDefaultResponseMessages(false)
                .ignoredParameterTypes()
                .apiInfo(new ApiInfo("hotel-api", "API dla hotelu", "0.1.0", "",
                        new Contact("Filip Brzozowski", "https://github.com/fbrzoz", ""), "", "", Collections.emptyList()));
    }
}
