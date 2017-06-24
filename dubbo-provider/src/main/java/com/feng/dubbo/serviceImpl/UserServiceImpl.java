package com.feng.dubbo.serviceImpl;


import org.springframework.stereotype.Service;
 
import com.feng.dubbo.service.UserService;
 
@Service("userService")
public class UserServiceImpl implements UserService{
 
    @Override
    public String sayHello() {
         
        System.out.println("hello world----------------------------");
         
        return "hello world";
         
    }
}