package hkw.onlineLibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import hkw.onlineLibrary.model.User;
import hkw.onlineLibrary.service.UserService;




@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String getPage(){
        return "Hello World";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        boolean loginSuccess = userService.loginUser(user.getPhoneNumber(), user.getPassword());
        return loginSuccess ? "True" : "False";
    }

    @PostMapping("/save")
    public String saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
    
    

}
