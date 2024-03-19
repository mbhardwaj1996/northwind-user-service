package com.northwind.user.service;

import com.northwind.user.dto.UserDto;
import com.northwind.user.entity.User;
import com.northwind.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    User createUser(UserDto userdto);

    List<User> getUsers();

    User updateUser(int id, UserDto userDto);

    void deleteByUserId(int id);


}
