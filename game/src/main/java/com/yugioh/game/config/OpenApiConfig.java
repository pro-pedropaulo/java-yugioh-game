package com.yugioh.game.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Yugioh Duel API")
                        .version("v1")
                        .description("API para duelos de cartas inspirado no anime Yu-Gi-Oh!")
                        .contact(new Contact().name("Duel Masters").email("duel@ygame.local"))
                        .license(new License().name("Apache 2.0")));
    }
}
