package com.northwind.user.service;

import com.northwind.user.dto.UserDto;
import com.northwind.user.entity.UserEntity;
import com.northwind.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class UserService {
        @Autowired
        private UserRepository userRepository;
        public UserEntity createUser(UserDto userdto) {
            System.out.println(Thread.currentThread().getName());
            String userId = UUID.randomUUID().toString();
            UserEntity userEntity = new UserEntity();
            userEntity.setUserId(userId);
            userEntity.setCompany_name(userdto.getCompany_name());
            userEntity.setCompany_name(userdto.getCompany_name());
            userEntity.setContact_name(userdto.getContact_name());
            userEntity.setContact_title(userdto.getContact_title());
            userEntity.setAddress(userdto.getAddress());
            userEntity.setCity(userdto.getCity());
            userEntity.setRegion(userdto.getRegion());
            userEntity.setPostal_code(userdto.getPostal_code());
            userEntity.setCountry(userdto.getCountry());
            userEntity.setPhone(userdto.getPhone());
            userEntity.setFax(userdto.getFax());
            return userRepository.save(userEntity);
        }

        public List<UserEntity> getUsers() {
            return userRepository.findAll();
        }

        public UserEntity updateUser(String id, UserDto userDto) {
            Optional<UserEntity> optionalUserEntity = userRepository.findById(id);
       /* userEntity.stream().forEach(userEntity1 -> userEntity1.setCompany_name(userDto.getCompany_name()));
        return userRepository.save(userEntity);*/
            if(optionalUserEntity.isPresent()){
                UserEntity userEntity = optionalUserEntity.get();
                userEntity.setCompany_name(userDto.getCompany_name());
                userEntity.setCity(userDto.getCity());
                return userRepository.save(userEntity);
            }
            return null;
        }

        @Transactional(propagation = Propagation.REQUIRED)
        public void deleteByuserId(String id) {
            userRepository.deleteById(id);
        }

    /*public void deleteByCompanyName(String company_Name) {
        userRepository.deleteByCompanyName(company_Name);
    }*/
}
