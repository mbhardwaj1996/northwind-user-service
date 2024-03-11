package com.northwind.user.controller;

import com.northwind.user.dto.UserDto;
import com.northwind.user.entity.UserEntity;
import com.northwind.user.model.CustomResponseModel;
import com.northwind.user.model.MetaData;
import com.northwind.user.model.ResourceData;
import com.northwind.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

   @PostMapping(value = "/create")
    public ResponseEntity<CustomResponseModel> createUser(@RequestBody UserDto userdto){
        UserEntity userEntity = userService.createUser(userdto);
        MetaData metaData = MetaData.builder().code("200").status("Success").message("user created").version("1.0").build();
        ResourceData resourceData = ResourceData.builder().data(userEntity).build();
        CustomResponseModel customResponseModel = CustomResponseModel.builder().metaData(metaData).resourceData(resourceData).build();
        return new ResponseEntity<>(customResponseModel, HttpStatus.CREATED);
    }

    @GetMapping(value = "/all")
    public ResponseEntity<CustomResponseModel> getUsers(){
       List<UserEntity> userEntity = userService.getUsers();
       MetaData metaData = MetaData.builder().code("400").status("get users").message("getting users successfully").version("1.0").build();
       ResourceData resourceData = ResourceData.builder().data(userEntity).build();
       CustomResponseModel customResponseModel = CustomResponseModel.builder().metaData(metaData).resourceData(resourceData).build();

       return new ResponseEntity<>(customResponseModel,HttpStatus.OK);
   }

   @PutMapping(value = "/update/{id}")
    public ResponseEntity<CustomResponseModel> updateUser(@PathVariable(name = "id") String id, @RequestBody UserDto userDto){
       UserEntity userEntity = userService.updateUser(id, userDto);
       MetaData metaData = MetaData.builder().code("400").status("update user successfully").message("update user by company name").version("1.0").build();
       ResourceData resourceData = ResourceData.builder().data(userEntity).build();
       CustomResponseModel customResponseModel = CustomResponseModel.builder().metaData(metaData).resourceData(resourceData).build();
       return new ResponseEntity<>(customResponseModel, HttpStatus.BAD_REQUEST);
   }
    @DeleteMapping(value = "/deleteByid/{id}")
    public ResponseEntity<CustomResponseModel> deleteByName(@PathVariable(name = "id") String id) {
        userService.deleteByuserId(id);
        MetaData metaDate = MetaData.builder().code("200").status("Success").message("Deleted Successfully").version("1.0").build();
        CustomResponseModel customResponseModel = CustomResponseModel.builder().metaData(metaDate).build();
        return new ResponseEntity<>(customResponseModel, HttpStatus.OK);
    }

   }

