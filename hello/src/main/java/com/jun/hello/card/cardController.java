package com.jun.hello.card;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class cardController {
    
    @GetMapping("/card")
    public String getMethodName() {
        return "card/card";
    }

}
