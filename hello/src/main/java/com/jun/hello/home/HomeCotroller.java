package com.jun.hello.home;

import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequiredArgsConstructor
@Slf4j
public class HomeCotroller {
    
    @GetMapping("/home")
    public String getMethodName() {
        return "home/home";
    }
    
    
}
