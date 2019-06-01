package com.firefly.training.camp;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MapUserRepository implements UserRepository {

    private static Map<String, User> users = new HashMap();

    static {
        users.put("Kobe", new User(1L, "Kobe", "123456"));
        users.put("James", new User(2L, "James", "123456"));
    }

    @Override
    public Boolean checkUser(String userName, String pwd) {
        if (users.containsKey(userName) && users.get(userName).getPwd().equals(pwd)) {
            return true;
        }
        return false;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    static class User {

        private Long id;
        private String name;
        private String pwd;
    }
}
