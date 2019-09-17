package com.wm.demo.controller;

import com.wm.demo.init.Permissions;
import com.wm.demo.init.Role;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/get1")
    @Permissions(name = "get1接口")
    public String get1() {
        return "OK1";
    }

    @GetMapping("/get2")
    @Permissions(dynamic = true)
    public String get2() {
        return "OK2";
    }

    @PostMapping("/post1")
    @Permissions(role = Role.NORMAL)
    public String post1() {
        return "post1";
    }

}
