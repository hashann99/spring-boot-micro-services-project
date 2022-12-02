package com.hashan.users.service;

import com.hashan.users.dto.UserDto;
import com.hashan.users.vo.ResponseTemplateVo;

public interface UserService {
    UserDto saveUser(UserDto userDto);

    ResponseTemplateVo findUserWithDepartmentByUserId(Long userId);
}
