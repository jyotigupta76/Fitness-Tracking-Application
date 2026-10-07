package com.project.Fitness.controlller;

import com.project.Fitness.dto.ActivityResponse;
import com.project.Fitness.dto.UserResponse;
import com.project.Fitness.service.ActivityService;
import com.project.Fitness.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@Data
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(
            @RequestBody UserResponse userResponse) {
            return ResponseEntity.ok(userService.register(userResponse));
    }


}
