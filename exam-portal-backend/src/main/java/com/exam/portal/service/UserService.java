package com.exam.portal.service;

import com.exam.portal.model.User;
import com.exam.portal.model.UserRole;

import java.util.Set;

public interface UserService {

    //Creating User
    public User createUser(User user, Set<UserRole> userRoleSet) throws Exception;

    //Get User by Username
    public User getUser(String username);

    //delete user by username
    public void deleteUser(Long id);
}
