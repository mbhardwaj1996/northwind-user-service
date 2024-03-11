package com.northwind.user.repository;

import com.northwind.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String >{
    @Override
    Optional<UserEntity> findById(String id);

    @Override
    void deleteById(String id);


}
