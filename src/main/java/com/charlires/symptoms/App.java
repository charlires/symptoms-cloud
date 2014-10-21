package com.charlires.symptoms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.http.MediaType;

/**
 * Created by carlos_andonaegui on 10/20/14.
 */

@Configuration
@ComponentScan
@EnableMongoRepositories
@EnableAutoConfiguration
public class App extends RepositoryRestMvcConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    protected void configureJacksonObjectMapper(ObjectMapper objectMapper) {
        // This changes json out put format
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        super.configureJacksonObjectMapper(objectMapper);
    }

    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        // This disables the default jso+hal standard
        config.setDefaultMediaType(MediaType.APPLICATION_JSON);
        super.configureRepositoryRestConfiguration(config);
    }
}
