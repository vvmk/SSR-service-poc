package com.complexaesthetic.shfflshineservice.repository;

import com.complexaesthetic.shfflshineservice.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * project: shffl-shine-service
 * package: com.complexaesthetic.shfflshineservice.repository
 * author: https://github.com/vvmk
 * date: 4/10/18
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
