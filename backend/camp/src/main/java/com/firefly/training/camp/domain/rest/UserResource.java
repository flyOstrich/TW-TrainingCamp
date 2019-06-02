package com.firefly.training.camp.domain.rest;

import com.firefly.training.camp.domain.dto.UserCheckDTO;
import com.firefly.training.camp.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public UserCheckDTO checkUser(
            @RequestParam String userName,
            @RequestParam String pwd) {
        return new UserCheckDTO(userService.checkUser(userName, pwd));
    }
}
