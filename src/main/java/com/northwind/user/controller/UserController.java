package com.northwind.user.controller;

import com.northwind.user.dto.UserDto;
import com.northwind.user.entity.User;
import com.northwind.user.model.CustomResponseModel;
import com.northwind.user.model.MetaData;
import com.northwind.user.model.ResourceData;
import com.northwind.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

   @PostMapping(value = "/create")
   public ResponseEntity<User> createUser(@RequestBody @Validated UserDto userdto){
       User user = userService.createUser(userdto);
       return ResponseEntity.ok(user);
   }

    @GetMapping(value = "/all")
    public ResponseEntity<List<User>> getUsers(){

        List<User> userEntity = userService.getUsers();
        return ResponseEntity.ok(userEntity);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(name = "id") int id, @RequestBody @Validated UserDto userDto){
        User userEntity = userService.updateUser(id, userDto);
        return ResponseEntity.ok(userEntity);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public String deleteByName(@PathVariable(name = "id") int id) {
        userService.deleteByUserId(id);
        return "user deleted Successfully";
    }

   }

