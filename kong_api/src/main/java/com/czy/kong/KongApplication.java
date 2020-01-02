package com.czy.kong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@ServletComponentScan
@SpringBootApplication
public class KongApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder springApplicationBuilder) {
        springApplicationBuilder.sources(this.getClass());
        return super.configure(springApplicationBuilder);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(KongApplication.class, args);
    }
}
