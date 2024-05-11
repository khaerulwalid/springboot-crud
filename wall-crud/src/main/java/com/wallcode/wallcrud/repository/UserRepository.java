package com.wallcode.wallcrud.repository;

import com.wallcode.wallcrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
