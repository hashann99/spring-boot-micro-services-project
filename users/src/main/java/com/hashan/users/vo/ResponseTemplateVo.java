package com.hashan.users.vo;

import com.hashan.users.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseTemplateVo {
    private User user;
    private Department department;
}
