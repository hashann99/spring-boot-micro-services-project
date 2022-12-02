package com.hashan.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;
}
