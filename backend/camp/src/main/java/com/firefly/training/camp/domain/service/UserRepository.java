package com.firefly.training.camp.domain.service;

public interface UserRepository {

    Boolean checkUser(String userName, String pwd);
}
