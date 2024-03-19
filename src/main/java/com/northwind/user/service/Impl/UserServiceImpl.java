package com.northwind.user.service.Impl;

import com.northwind.user.dto.UserDto;
import com.northwind.user.entity.User;
import com.northwind.user.repository.UserRepository;
import com.northwind.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(UserDto userdto) {
        User userEntity = new User();

        userEntity.setCompanyName(userdto.getCompany_name());

        userEntity.setContactName(userdto.getContact_name());

        userEntity.setContactTitle(userdto.getContact_title());

        userEntity.setAddress(userdto.getAddress());

        userEntity.setCity(userdto.getCity());

        userEntity.setRegion(userdto.getRegion());

        userEntity.setPostalCode(userdto.getPostal_code());

        userEntity.setCountry(userdto.getCountry());

        userEntity.setPhone(userdto.getPhone());

        userEntity.setFax(userdto.getFax());

        return userRepository.save(userEntity);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User updateUser(int id, UserDto userDto) {
        Optional<User> optionalUserEntity = userRepository.findById(id);

        if(optionalUserEntity.isPresent()){

            User userEntity = optionalUserEntity.get();
            userEntity.setCompanyName(userDto.getCompany_name());
            userEntity.setCity(userDto.getCity());
            return userRepository.save(userEntity);
        }
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteByUserId(int id) {
        userRepository.deleteById(id);
    }
}
