package by.znak.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "by.znak.controller")
@EnableWebMvc
@Import(value = {
        ThymeleafConfig.class,
        MvcConfig.class
})
public class WebConfig {
}
