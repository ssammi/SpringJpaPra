package com.sam.springmvcselftry.repository;

import com.sam.springmvcselftry.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User, Long>{
    User findByName(String name);
}
