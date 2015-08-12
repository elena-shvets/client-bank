package com.clientbank.repository.config;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by elena on 11.08.15.
 */
@Configuration
@Profile("h2")
@EnableTransactionManagement
@PropertySource({ "classpath:persistence.properties" })
@ComponentScan({ "com.clientbank.repository" })
public class H2Config implements RepositoryConfig {

    private static final String LAUNCH_SCRIPT = "create-database.sql";

    @Bean
    @Override
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean result = new LocalSessionFactoryBean();
        result.setDataSource(dataSource());
        result.setPackagesToScan(new String[] { "com.clientbank.repository" });
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
        result.setHibernateProperties(properties);
        return result;
    }

    @Bean
    @Override
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
                .setName("test").addScript(LAUNCH_SCRIPT).build();
    }

    @Bean
    @Override
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager man = new HibernateTransactionManager();
        man.setSessionFactory(sessionFactory().getObject());
        return man;
    }

}
