package ljl.bilibili.user_center;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableFeignClients(basePackages = "ljl.bilibili.client")
@ComponentScan(basePackages = "ljl.*")
@MapperScan({"ljl.bilibili.mapper", "ljl.bilibili.user_center.mapper"})
@EnableDiscoveryClient
public class CenterEditApplication {
    public static void main(String[] args) {
        SpringApplication.run(CenterEditApplication.class,args);
    }
}
