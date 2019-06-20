package hu.poc.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Slf4j
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        log.info("WebConfig - add special CORS config");
        registry.addMapping("/api/**")
                .allowedOrigins("*")
                .maxAge(3600)
                .allowCredentials(true)
                .allowedHeaders("Origin", "X-Requested-With", "Content-Type", "Content-Length", "Content-Transfer-Encoding", "Accept", "if-modified-since", "Cache-Control", "Pragma", "Location", "Response-Header", "X-Powered-By", "TOKEN", "token")
                .exposedHeaders("Origin", "X-Requested-With", "Content-Type", "Content-Length", "Content-Transfer-Encoding", "Accept", "if-modified-since", "Cache-Control", "Pragma", "Location", "Response-Header", "X-Powered-By", "TOKEN", "token")
                .allowedMethods("POST", "GET", "OPTIONS", "DELETE", "PUT");
    }
}
