package com.example.currencyconversionsampleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CurrencyConversionSampleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConversionSampleServiceApplication.class, args);
    }

}
