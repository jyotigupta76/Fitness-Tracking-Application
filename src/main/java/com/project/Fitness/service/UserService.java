package com.project.Fitness.service;

import com.project.Fitness.model.User;
import com.project.Fitness.repository.UserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Data
public class UserService {

    private final UserRepository userRepository ;

    public User register(User user) {
        return userRepository.save(user);
    }

}

