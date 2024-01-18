package com.sparta.spring_mvc.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("response")
public class responsecontroller {

    @GetMapping("/json/string")
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }
    // Content-type 이 applicatation/json
    //response body
    @GetMapping("/json/class")
    public Star helloStringclass() { // Spring 은 객체의 를 json 을로 변환해줌
        return new Star("Robit",98);
    }
}
