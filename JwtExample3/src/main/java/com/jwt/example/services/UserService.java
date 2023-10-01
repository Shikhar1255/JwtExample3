package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store= new ArrayList<>();


    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Shikhar","sharwaliashikhar@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Prachi","prachi134@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"harshit","harshit@gmail.com"));
    }


    public List<User> getUser() {
        return store;
    }
}
