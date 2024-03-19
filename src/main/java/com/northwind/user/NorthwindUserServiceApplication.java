package com.northwind.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NorthwindUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindUserServiceApplication.class, args);

   /* public ResponseEntity<CustomResponseModel> createUser(@RequestBody UserDto userdto){
        User userEntity = userService.createUser(userdto);
        MetaData metaData = MetaData.builder().code("200").status("Success").message("user created").version("1.0").build();
        ResourceData resourceData = ResourceData.builder().data(userEntity).build();
        CustomResponseModel customResponseModel = CustomResponseModel.builder().metaData(metaData).resourceData(resourceData).build();
        return new ResponseEntity<>(customResponseModel, HttpStatus.CREATED);
    }
*/


   /*  @GetMapping(value = "/all")
    public ResponseEntity<CustomResponseModel> getUsers(){
       List<User> userEntity = userService.getUsers();
       MetaData metaData = MetaData.builder().code("400").status("get users").message("getting users successfully").version("1.0").build();
       ResourceData resourceData = ResourceData.builder().data(userEntity).build();
       CustomResponseModel customResponseModel = CustomResponseModel.builder().metaData(metaData).resourceData(resourceData).build();

       return new ResponseEntity<>(customResponseModel,HttpStatus.OK);
   }*/

    /*@PutMapping(value = "/update/{id}")
    public ResponseEntity<CustomResponseModel> updateUser(@PathVariable(name = "id") int id, @RequestBody UserDto userDto){
       User userEntity = userService.updateUser(id, userDto);
       MetaData metaData = MetaData.builder().code("400").status("update user successfully").message("update user by company name").version("1.0").build();
       ResourceData resourceData = ResourceData.builder().data(userEntity).build();
       CustomResponseModel customResponseModel = CustomResponseModel.builder().metaData(metaData).resourceData(resourceData).build();
       return new ResponseEntity<>(customResponseModel, HttpStatus.BAD_REQUEST);
   }*/



    /*@DeleteMapping(value = "/deleteByid/{id}")
    public ResponseEntity<CustomResponseModel> deleteByName(@PathVariable(name = "id") int id) {
        userService.deleteByuserId(id);
        MetaData metaDate = MetaData.builder().code("200").status("Success").message("Deleted Successfully").version("1.0").build();
        CustomResponseModel customResponseModel = CustomResponseModel.builder().metaData(metaDate).build();
        return new ResponseEntity<>(customResponseModel, HttpStatus.OK);
    }*/


	}

}
