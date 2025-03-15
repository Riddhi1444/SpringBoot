package com.rcoem.devops.services;

import com.rcoem.devops.dto.UserInfo;
import com.rcoem.devops.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    UserInfoRepository userInfoRepository;
    public List<UserInfo> getAllUsers(){
        return userInfoRepository.getAllUsers();
    }
    public UserInfo createUser(UserInfo userInfo){
        return userInfoRepository.createUser(userInfo);
    }

}
