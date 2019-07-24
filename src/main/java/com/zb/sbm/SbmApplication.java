package com.zb.sbm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.zb.sbm.dao")
public class SbmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmApplication.class, args);
    }

}
