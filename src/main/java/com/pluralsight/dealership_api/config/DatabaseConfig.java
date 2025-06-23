package com.pluralsight.dealership_api.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Configuration

public class DatabaseConfig {

    private BasicDataSource basicDataSource;

    @Bean
    public DataSource dataSource(){
        return basicDataSource;
    }
    @Autowired
   public DatabaseConfig(@Value("${datasource.url}") String url){

        String username = System.getProperty("dbUsername");
        String password = System.getProperty("dbPassword");

     //build basic datasource
     basicDataSource = new BasicDataSource();
     basicDataSource.setUrl(url);
     basicDataSource.setUsername(username);
     basicDataSource.setPassword(password);
  }
}
