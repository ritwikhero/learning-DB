package com.example.databaseLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }


    @GetMapping("/getUserById")
    public User getUser(@RequestParam("userId")Integer userId){
        return userService.getUserById(userId);
    }
}
