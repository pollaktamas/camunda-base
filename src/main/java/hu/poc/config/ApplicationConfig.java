package hu.poc.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import hu.poc.util.json.ObjectMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Configuration
public class ApplicationConfig {

    @Bean
    ObjectMapper getObjectMapper() {
        return ObjectMapperFactory.createObjectMapper();
    }

    @Bean
    MappingJackson2HttpMessageConverter getMappingJackson2HttpMessageConverter(@Autowired ObjectMapper objectMapper) {
        return new MappingJackson2HttpMessageConverter(objectMapper);
    }
}
