package com.simundi.multimodules.business;

import com.simundi.multimodules.repositories.domain.User;

import java.util.Collection;

public interface UserService {

    Collection<User> getAll();
}
