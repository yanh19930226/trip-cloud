package com.trip.article.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"cn.wolfcode.wolf2w.core", "cn.wolfcode.wolf2w.article"})
@SpringBootApplication
public class ArticleServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleServerApplication.class, args);
    }
}
