package nnam01.MyHomePage.controller;

import lombok.RequiredArgsConstructor;
import nnam01.MyHomePage.model.User;
import nnam01.MyHomePage.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    // 회원 가입 API (POST 요청)
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User savedUser = userService.registerUser(user);
        return ResponseEntity.ok(savedUser);
    }
    // 로그인 API
    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody Map<String, String> loginRequest) {
        String username = loginRequest.get("username");
        String password = loginRequest.get("password");

        User user = userService.login(username, password);
        return ResponseEntity.ok(user);
    }
}

