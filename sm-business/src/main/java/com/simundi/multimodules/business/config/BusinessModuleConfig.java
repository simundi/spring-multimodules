package com.simundi.multimodules.business.config;

import com.simundi.multimodules.repositories.config.RepositoryModuleConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.simundi.multimodules.business")
@Import({RepositoryModuleConfig.class})
public class BusinessModuleConfig {
}
