package com.rcoem.devops;

import com.rcoem.devops.dto.UserInfo;
import com.rcoem.devops.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping()
    List<UserInfo> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping()
    UserInfo createUser(@RequestBody UserInfo userInfo){
        return userService.createUser(userInfo);
    }
}
