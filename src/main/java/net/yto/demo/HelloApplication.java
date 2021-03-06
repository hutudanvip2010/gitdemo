package net.yto.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@Configuration
public class HelloApplication {

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(HelloApplication.class);
        //关闭banner
//        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

    }
}
