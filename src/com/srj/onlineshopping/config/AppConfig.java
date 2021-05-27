package com.srj.onlineshopping.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("com.srj.onlineshopping.repository"),
	      					@ComponentScan("com.srj.onlineshopping.service") })
public class AppConfig {

}
