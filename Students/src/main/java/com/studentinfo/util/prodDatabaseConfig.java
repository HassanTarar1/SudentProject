package com.studentinfo.util;//package com.example.studentinfo.util;
//
//import ch.qos.logback.core.spi.ConfigurationEvent;
//import com.zaxxer.hikari.HikariDataSource;
//import org.hibernate.Hibernate;
//import org.hibernate.sql.ast.tree.expression.Collation;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.core.env.ConfigurableEnvironment;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaDialect;
//
//import javax.sql.DataSource;
//import java.util.Collections;
//import java.util.Map;
//import java.util.Properties;
//
//@Configuration
//@Profile("prod")
//public class prodDatabaseConfig {
//
////    spring.datasource.name=db
////    spring.datasource.url=jdbc:mysql://localhost:3306/db
////    spring.datasource.username=root
////    spring.datasource.password=root12
////    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
////    spring.jpa.hibernate.ddl-auto=update
////    spring.profiles.active= prod
//
//
//    @Bean
//    public DataSource dataSource () {
//        HikariDataSource dataSource= new HikariDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setSchema("db");
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root12");
//        dataSource.setSchema("db");
//
////        dataSource.setConnectionProperties(Collections.singletonMap("spring.jpa.hibernate.ddl-auto","update"));
//
//        dataSource.setDataSourceProperties( new Properties(){
//            {
//                put("spring.jpa.hibernate.ddl-auto", "update");
//            }
//       });
//
//
//        return dataSource;
//
//    }
//
//    @Configuration
//    @Profile("tst")
//    public class tstDatabaseConfig {
//
//
////#
////        #spring.h2.console.enabled=true
////                #spring.datasource.url=jdbc:h2:mem:dcbapp
////#spring.datasource.driverClassName=org.h2.Driver
////#spring.datasource.username=sa
////#spring.datasource.password=password
////#spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
////#
////        #spring.profiles= tst
//
//
//        @Bean
//        public DataSource dataSource() {
//            DriverManagerDataSource dataSource = new DriverManagerDataSource();
//            dataSource.setDriverClassName("org.h2.Driver");
//            dataSource.setUrl("jdbc:h2:mem:dcbapp");
//            dataSource.setUsername("sa");
//            dataSource.setPassword("password");
//            dataSource.setConnectionProperties(new Properties(){{
//                put("jpa.database-platform","org.hibernate.dialect.H2Dialect");
//            }});
//            return dataSource;
//
//        }
//
//
//    }
//}