package com.clientbank.repository.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by elena on 11.08.15.
 */
@Configuration
@ComponentScan(basePackages="com.clientbank.repository")
public class PropertyLoaderConfig {
    @Bean
    public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer(){
        PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
        Resource persistence = new ClassPathResource("persistence.properties");
        configurer.setLocations(new Resource[]{persistence});
        return configurer;
    }
}
