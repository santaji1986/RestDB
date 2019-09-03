package org.san.restdb.controllers;

import org.san.restdb.dao.UserRepository;
import org.san.restdb.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "userId", required = false) String userId) {
        String username = "EMPTY";
        if (null != userId) {
            final User user = userRepository.getOne(Long.parseLong(userId));
            System.out.println("OpenAccessController.hello()" + user.getUsername());
            username = user.getUsername();
        }
        return "Response is - " + username;
    }
}
