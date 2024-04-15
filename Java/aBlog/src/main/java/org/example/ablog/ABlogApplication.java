package org.example.ablog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.ablog.blog.mapper")
public class ABlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ABlogApplication.class, args);
    }

}
