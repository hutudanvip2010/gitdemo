package net.yto.demo.dao;

import net.yto.demo.domain.User;

import java.util.List;

public interface IUserDao {
    public List<User> queryUserList();
}
