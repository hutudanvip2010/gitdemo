package net.yto.demo.dao.impl;

import net.yto.demo.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> queryUserList() {
        List<User> result = new ArrayList<User>();

        //模拟数据库的查询
        for(int i=0; i<10; i++) {
            User user = new User();
            user.setUername("username" + i);
            user.setPassword("userpassword" + i);
            user.setAge(i+1);
            result.add(user);
        }
        return result;
    }
}
