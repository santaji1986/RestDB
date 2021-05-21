package org.san.restdb.controllers;

import java.util.List;
import java.util.Optional;

import org.san.restdb.dao.UserRepository;
import org.san.restdb.dto.AddStudentRequest;
import org.san.restdb.dto.AddUserRequest;
import org.san.restdb.dto.UpdateStudentRequest;
import org.san.restdb.dto.UpdateUserRequest;
import org.san.restdb.models.Student;
import org.san.restdb.models.User;
import org.san.restdb.service.StudentService;
import org.san.restdb.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyController.class);
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/hello")
    public User hello(@RequestParam(value = "userId", required = false)
    String userId) {
        User user = null;
        if (null != userId) {
            final Optional<User> userOptional = userRepository.findById(Integer.parseInt(userId));
            if (userOptional.isPresent()) {
                user = userOptional.get();
            }
            LOGGER.info("OpenAccessController.hello() {}", user == null ? "" : user.getUsername());
        }
        return user;
    }

    @PostMapping("/addUser")
    public ResponseEntity<String> addNewUser(@RequestBody
    AddUserRequest userInfo) {
        userService.addUser(userInfo);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @PutMapping("updateUser")
    public ResponseEntity<String> updateUser(@RequestBody
    UpdateUserRequest userInfo) {
        try {
            userService.updateUser(userInfo);
        } catch (final Exception exception) {
            return new ResponseEntity<>("Not success", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @GetMapping(value = "/getAllUsers")
    public List<User> getAllUsers() {
        final List<User> users = userService.getAllUsers();
        LOGGER.info("OpenAccessController.getAllUsers() size {}", users.size());
        return users;
    }

    @PostMapping("/addStudent")
    public ResponseEntity<String> addNewStudent(@RequestBody
    AddStudentRequest userInfo) {
        studentService.addStudent(userInfo);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @PutMapping("updateStudent")
    public ResponseEntity<String> updateStudent(@RequestBody
    UpdateStudentRequest userInfo) {
        try {
            studentService.updateStudent(userInfo);
        } catch (final Exception exception) {
            return new ResponseEntity<>("Not success", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @GetMapping(value = "/getAllStudents")
    public List<Student> getAllStudents() {
        final List<Student> students = studentService.getAllStudents();
        LOGGER.info("OpenAccessController.getAllStudents() size {}", students.size());
        return students;
    }
}
