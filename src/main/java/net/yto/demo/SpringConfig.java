package net.yto.demo;

import net.yto.demo.dao.impl.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
@ComponentScan(basePackages = "net.yto.demo")
public class SpringConfig {
    @Bean
    public UserDao getUserDao() {
        return new UserDao();
    }
}
