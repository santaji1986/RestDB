package org.san.restdb.controllers;

import java.util.List;
import java.util.Optional;

import org.san.restdb.dao.UserRepository;
import org.san.restdb.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/hello")
    public User hello(@RequestParam(value = "userId", required = false) String userId) {
        User user = null;
        if (null != userId) {
            Optional<User> userOptional = userRepository.findById(Long.parseLong(userId));
            user = userOptional.orElseGet(null);
            System.out.println("OpenAccessController.hello()" + user.getUsername());
        }
        return user;
    }

    @GetMapping(value = "/getAllData")
    public List<User> getData() {
        final List<User> userList = userRepository.findAll();
        System.out.println("OpenAccessController.getData() size " + userList.size());
        return userList;
    }
}
