package com.simundi.multimodules.business;

import com.simundi.multimodules.repositories.UserRepository;
import com.simundi.multimodules.repositories.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Collection<User> getAll(){
        return userRepository
                .findAll();
    }




}
