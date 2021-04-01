package com.sherry.meelo.users.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableWebMvc
//@EnableTransactionManagement
@ComponentScan(basePackages = {"com.sherry.meelo"})
//@PropertySource({"classpath:AccountsServiceApplication.properties"})
public class ApplicationConfiguration {


}