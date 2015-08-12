package com.clientbank.repository.config;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import javax.sql.DataSource;

/**
 * Created by elena on 11.08.15.
 */
public interface RepositoryConfig {
    @Bean
    LocalSessionFactoryBean sessionFactory();

    @Bean
    DataSource dataSource();

    @Bean
    HibernateTransactionManager transactionManager();
}
