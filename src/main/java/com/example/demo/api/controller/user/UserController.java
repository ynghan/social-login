package com.example.demo.api.controller.user;

import com.example.demo.api.entity.user.User;
import com.example.demo.api.service.UserService;
import com.example.demo.common.ApiResponse;
import com.example.demo.oauth.entity.UserPrincipal;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ApiResponse getUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserPrincipal userPrincipal) {
            User user = userService.getUser(userPrincipal.getUsername());
            return ApiResponse.success("user", user);
        } else if (principal instanceof User user) {
            return ApiResponse.success("user", user);
        }

        throw new RuntimeException("Unexpected principal type: " + principal.getClass());
    }
}
