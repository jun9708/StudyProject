package com.jun.hello.cardList;

import org.springframework.stereotype.Controller;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CardListController {
    
    @GetMapping("/cardList")
    public String getMethodName() {
        return "cardList/cardList";
    }
    
    
}
