package cn.yanyong.testboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.yanyong.testboot.mapper")
public class TestbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestbootApplication.class, args);

    }
}
