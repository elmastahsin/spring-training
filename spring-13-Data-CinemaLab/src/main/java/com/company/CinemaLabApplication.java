package com.company;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.output.MigrateResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class CinemaLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaLabApplication.class, args);
    }

    @Bean
    public MigrateResult migrateResult(DataSource dataSource) {
        return Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate();
    }
}
