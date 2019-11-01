package top.sniper.alipay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "pay.dang.ding.*")
public class AlipayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlipayApplication.class, args);
	}

}
