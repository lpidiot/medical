package com.airwaves.medical.hosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author airwaves
 * @create 2022-02-07 下午5:28
 * @description
 **/
@SpringBootApplication
@ComponentScan(basePackages = "com.airwaves")
public class ServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
