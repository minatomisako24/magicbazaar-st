package com.a243.magicbazaar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author minatomisako24
 * @date 2022/6/6 15:05
 */
@SpringBootApplication(scanBasePackages = {"com.a243.magicbazaar"})
public class MagicbazaarApp {
    public static void main(String[] args) {
        SpringApplication.run(MagicbazaarApp.class, args);
    }
}
