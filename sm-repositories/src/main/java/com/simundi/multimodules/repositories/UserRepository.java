package com.simundi.multimodules.repositories;

import com.simundi.multimodules.repositories.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
