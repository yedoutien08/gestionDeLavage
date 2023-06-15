package com.gestiondelavage.security.service;

import com.gestiondelavage.security.entity.User;
import com.gestiondelavage.security.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

        @Autowired
        private UserRepository userRepository;

        public List<User> getAllUser() {
            return userRepository.findAll();
        }

        public User getUserById(Long id) {
            return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("user non trouvé: " + id));

        }

        public User updateUser(Long id, User user) {
            getUserById(id); // Vérifie que le client existe
            user.setId(id);
            return userRepository.save(user);
        }

        public void deleteClient(Long id) {
            getUserById(id); // Vérifie que le client existe
            userRepository.deleteById(id);
        }


}

