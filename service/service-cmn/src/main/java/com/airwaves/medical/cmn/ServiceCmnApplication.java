package com.airwaves.medical.cmn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author airwaves
 * @create 2022-02-08 下午7:30
 * @description
 **/
@SpringBootApplication
@ComponentScan(basePackages = "com.airwaves")
public class ServiceCmnApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCmnApplication.class,args);
    }
}
