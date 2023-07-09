package com.company.service.impl;

import com.company.dto.UserDTO;
import com.company.entity.User;
import com.company.repository.UserRepository;
import com.company.service.UserService;
import com.company.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final MapperUtil mapperUtil;

    public UserServiceImpl(UserRepository userRepository, MapperUtil mapperUtil) {
        this.userRepository = userRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<UserDTO> getUsers() {
        return userRepository.findAll().stream().map(user -> mapperUtil.convert(user, new UserDTO())).collect(Collectors.toList());
    }

    @Override
    public UserDTO create(UserDTO userDTO) {
        return mapperUtil.convert(userRepository.save(mapperUtil.convert(userDTO, new User())), new UserDTO());
    }

}
