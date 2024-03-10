package yeonghwan.project.baseplussecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EntityScan("yeonghwan.project")
@EnableAsync
@EnableWebMvc
@SpringBootApplication(scanBasePackages = {"spring-module-base", "spring-module-security"})
public class BasePlusSecurityApplication {
	public static void main(String[] args) {
		SpringApplication.run(BasePlusSecurityApplication.class, args);
	}

}
