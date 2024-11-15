package com.jun.hello.article;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import groovy.util.logging.Slf4j;
import lombok.RequiredArgsConstructor;

@Controller
@Slf4j
@RequiredArgsConstructor
public class articleController {

    @GetMapping("/article")
    public String articleView() {
        return "article/article";
    }
}
