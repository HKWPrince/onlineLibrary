package hkw.onlineLibrary.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class LibraryController {

    @RequestMapping("/register")
    public String register() {
        // 註冊邏輯...
        return "Registration successful";
    }

    @RequestMapping("/login")
    public String login() {
        // 登入邏輯...
        return "Login successful";
    }
    


    // 添加借書和還書的API...
}
