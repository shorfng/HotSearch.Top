package top.hotsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author：蓝田_Loto
 * <p>Date：2021-01-21 0:07</p>
 * <p>PageName：EmailApplication8080.java</p>
 * <p>Function：发送邮件服务端 - 启动类</p>
 */

@SpringBootApplication
@EnableDiscoveryClient
public class EmailApplication8080 {
    public static void main(String[] args) {
        SpringApplication.run(EmailApplication8080.class, args);
    }
}
