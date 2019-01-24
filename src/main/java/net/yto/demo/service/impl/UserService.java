package net.yto.demo.service.impl;

import net.yto.demo.dao.impl.UserDao;
import net.yto.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao dao;

    public List<User> queryUserList(){
        return this.dao.queryUserList();
    }
}
