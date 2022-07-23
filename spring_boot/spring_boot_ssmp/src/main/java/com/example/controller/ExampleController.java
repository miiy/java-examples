package com.example.controller;

import com.example.common.response.Result;
import com.example.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("example/success-resp")
    public Result<String> successResp() {
        return Result.success(null);
    }

    @GetMapping("example/success-resp1")
    public Result<String> successResp1() {
        return Result.success("success");
    }

    @GetMapping("example/success-resp2")
    public Result<User> successResp2() {
        User user = new User();
        user.setId(1L);
        user.setName("zhangsan");
        return Result.success(user);
    }


    @GetMapping("example/error-resp")
    public Result<String> errorResp() {
        return Result.error("server error.");
    }
}
