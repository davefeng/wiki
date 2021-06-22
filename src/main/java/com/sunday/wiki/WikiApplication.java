package com.sunday.wiki;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class WikiApplication {

    public static final Logger log = LoggerFactory.getLogger(WikiApplication.class);

    public static void main(String[] args) {

        //SpringApplication.run(WikiApplication.class, args);

        SpringApplication app = new SpringApplication(WikiApplication.class);

        Environment env = app.run(args).getEnvironment();
        log.info("项目启动成功！");
        log.info("地址为:http:127.0.0.1:{}", env.getProperty("server.port"));

    }

}
