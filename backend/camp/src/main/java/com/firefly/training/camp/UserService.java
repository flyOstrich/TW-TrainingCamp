package com.firefly.training.camp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Boolean checkUser(String userName, String pwd) {
        return userRepository.checkUser(userName, pwd);
    }
}
