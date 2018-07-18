package com.simundi.multimodules.server;

import com.simundi.multimodules.api.config.ApiModuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ApiModuleConfig.class})
public class MultimodulesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultimodulesApplication.class, args);
	}
}
