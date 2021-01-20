package top.hotsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author：蓝田_Loto
 * <p>Date：2021-01-21 1:12</p>
 * <p>PageName：VerifyApplication8081.java</p>
 * <p>Function：</p>
 */

@SpringBootApplication
@EnableDiscoveryClient
public class VerifyApplication8081 {
    public static void main(String[] args) {
        SpringApplication.run(VerifyApplication8081.class, args);
    }
}
