package com.alibou.security.user;

import java.util.Optional;

import com.alibou.security.user.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

  Optional<User> findByEmail(String email);

}
