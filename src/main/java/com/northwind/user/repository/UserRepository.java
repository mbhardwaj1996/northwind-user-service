package com.northwind.user.repository;

import com.northwind.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Integer >{
    @Override
    Optional<User> findById(Integer id);

    @Override
    void deleteById(Integer id);




}
