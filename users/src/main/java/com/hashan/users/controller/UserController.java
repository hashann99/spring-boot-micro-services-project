package com.hashan.users.controller;

import com.hashan.users.dto.UserDto;
import com.hashan.users.service.UserService;
import com.hashan.users.vo.ResponseTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

    @GetMapping("/find/{id}")
    public ResponseTemplateVo findUserWithDepartmentByUserId(@PathVariable("id") Long userId){
        System.out.println("Working");
        return userService.findUserWithDepartmentByUserId(userId);
    }


}
