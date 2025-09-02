package com.example.demo.crontoller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list(){
        return userService.list();
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){
        userService.UserUpdate(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        userService.UserDelete(id);
    }


}
