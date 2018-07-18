package com.simundi.multimodules.repositories.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * As I'm not using default behavior for JPA entites en repositories.
 * I've specified them manually here.
 */
@Configuration
@ComponentScan("com.simundi.multimodules.repositories")

@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.simundi.multimodules.repositories")
@EntityScan(basePackages = "com.simundi.multimodules.repositories.domain")
public class RepositoryModuleConfig {
}
