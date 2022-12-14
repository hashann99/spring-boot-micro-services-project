package com.hashan.users;

import com.hashan.users.vo.ResponseTemplateVo;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
    @Bean
    public ResponseTemplateVo responseTemplateVo(){
        return new ResponseTemplateVo();
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
