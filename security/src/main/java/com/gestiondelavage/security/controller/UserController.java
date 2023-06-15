package com.gestiondelavage.security.controller;

import com.gestiondelavage.security.entity.User;
import com.gestiondelavage.security.repository.UserRepository;
import com.gestiondelavage.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user/")
public class UserController {

        @Autowired
        private UserRepository userRepository;
        private UserService userService;

        @GetMapping
        public List<User> getAllUser() {
                return userService.getAllUser();
        }

        @GetMapping("{id}")
        public User getAllUser(@PathVariable Long id) {
                return userService.getUserById(id);
        }

        @PostMapping("create")
        public User createUser(@RequestBody User user) {
                return userRepository.save(user);
        }

        @PutMapping("update/{id}")
        public User updateUser(@PathVariable Long id, @RequestBody User user) {
                return userService.updateUser(id, user);
        }

        @DeleteMapping("/delete/{id}")
        public void deleteClient(@PathVariable Long id) {
                userService.deleteClient(id);
        }

        @PostMapping("login")
        public User login(@RequestBody User user) {
                User userFound = userRepository.findByLogin(user.getLogin());

                if(userFound != null  && (userFound.getPassword().equals(user.getPassword()))) {
                        return userFound;

                } else {

                        return null;

                }

        }

}







