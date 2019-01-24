package net.yto.demo;

import net.yto.demo.domain.User;
import net.yto.demo.service.impl.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context;
        context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = context.getBean(UserService.class);

        List<User> list = userService.queryUserList();

        for(User user : list) {
            System.out.println(user.getUername() + "," + user.getPassword() + "," + user.getAge());

            //销毁该容器
            context.destroy();
        }
    }
}
