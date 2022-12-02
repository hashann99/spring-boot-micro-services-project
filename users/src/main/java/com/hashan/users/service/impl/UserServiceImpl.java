package com.hashan.users.service.impl;

import com.hashan.users.dto.UserDto;
import com.hashan.users.entity.User;
import com.hashan.users.repo.UserRepo;
import com.hashan.users.service.UserService;
import com.hashan.users.vo.Department;
import com.hashan.users.vo.ResponseTemplateVo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ResponseTemplateVo responseTemplateVo;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        User userEntity = userRepo.save(user);
        return modelMapper.map(userEntity,UserDto.class);
    }

    @Override
    public ResponseTemplateVo findUserWithDepartmentByUserId(Long userId) {

        User userEntity = userRepo.findUserById(userId);

        restTemplate.getForObject("", Department.class);

        return modelMapper.map(userEntity,UserDto.class);
    }
}
