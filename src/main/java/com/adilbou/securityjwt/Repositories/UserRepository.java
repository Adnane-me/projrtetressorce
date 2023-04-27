package com.adilbou.securityjwt.Repositories;


import com.adilbou.securityjwt.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByUserName(String userName);
}
