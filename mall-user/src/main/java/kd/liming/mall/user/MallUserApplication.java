package kd.liming.mall.user;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("kd.liming.mall.user.mapper")
@Slf4j
public class MallUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallUserApplication.class, args);
	}

}
