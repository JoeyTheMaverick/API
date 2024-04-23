package com.example.demo.service;

import com.example.demo.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class userService {

    private List<User> userList;

    public userService(){
        userList = new ArrayList<>();

        User user1 =  new User(1,"Jager",37,"jager@mail.com");
        User user2 =  new User(2,"Kratos",107,"boy@mail.com");
        User user3 =  new User(3,"Alonso",16,"elplan@mail.com");

        userList.addAll(Arrays.asList(user1,user2,user3));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList){
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }

        }
        return optional;
    }
}
