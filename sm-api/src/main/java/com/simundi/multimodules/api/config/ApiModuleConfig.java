package com.simundi.multimodules.api.config;


import com.simundi.multimodules.business.config.BusinessModuleConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.simundi.multimodules.api")
@Import({BusinessModuleConfig.class})
public class ApiModuleConfig {
}
