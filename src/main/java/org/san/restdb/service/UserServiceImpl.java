package org.san.restdb.service;

import java.util.List;
import java.util.Optional;

import org.san.restdb.dao.UserRepository;
import org.san.restdb.dto.AddUserRequest;
import org.san.restdb.dto.UpdateUserRequest;
import org.san.restdb.exceptions.DataNotFoundException;
import org.san.restdb.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(AddUserRequest userInfo) {
        final User userToAdd = new User();
        userToAdd.setUsername(userInfo.getUsername());
        userToAdd.setPassword(userInfo.getPassword());
        userToAdd.setCity(userInfo.getCity());
        userRepository.save(userToAdd);
    }

    @Override
    @Transactional
    public void updateUser(UpdateUserRequest updateUserInfo) throws DataNotFoundException {
        final Optional<User> userToUpdate = userRepository.findById(updateUserInfo.getUserId());
        if (!userToUpdate.isPresent()) {
            throw new DataNotFoundException("User is not found");
        }
        final User existingUser = userToUpdate.get();

        // Updating entity in transactional context. No need to call save method
        existingUser.setUsername(updateUserInfo.getUsername());
        existingUser.setPassword(updateUserInfo.getPassword());
        existingUser.setCity(updateUserInfo.getCity());
        userRepository.save(existingUser);
    }

    @Override
    public List<User> getAllUsers() {
        final List<User> users = userRepository.findAll();
        return users;
    }

}
