package com.fukkatsumi.tacocloud.repository;

import com.fukkatsumi.tacocloud.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
