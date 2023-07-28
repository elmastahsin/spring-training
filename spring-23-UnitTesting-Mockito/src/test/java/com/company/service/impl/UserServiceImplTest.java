package com.company.service.impl;

import com.company.mapper.UserMapper;
import com.company.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    // we didnt have any exception in this line
    // mockito is creating a fake object for us]
    //mockito we use for unit testing


    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserServiceImpl userService;
    @Mock
    UserMapper userMapper;

    @Test
    void findByUserName() {
        // I am calling the real method inside the main,which is the method i want to test
        userService.findByUserName("harold@manager.com");
        // I am verifying if the method is called or not
        verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, times(1)).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atLeastOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atLeast(1)).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atMostOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atMost(1)).findByUserNameAndIsDeleted("harold@manager.com", false);

    }


}