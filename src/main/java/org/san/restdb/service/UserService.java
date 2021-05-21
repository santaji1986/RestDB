package org.san.restdb.service;

import java.util.List;

import org.san.restdb.dto.AddUserRequest;
import org.san.restdb.dto.UpdateUserRequest;
import org.san.restdb.exceptions.DataNotFoundException;
import org.san.restdb.models.User;

public interface UserService {
    void addUser(AddUserRequest user);

    void updateUser(UpdateUserRequest updateUserInfo) throws DataNotFoundException;

    List<User> getAllUsers();

}
