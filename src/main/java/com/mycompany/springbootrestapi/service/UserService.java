package com.mycompany.springbootrestapi.service;

import com.mycompany.springbootrestapi.model.User;
import com.mycompany.springbootrestapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Crear
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Leer
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Actualizar
    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow();
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        return userRepository.save(user);
    }

    // Eliminar
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}