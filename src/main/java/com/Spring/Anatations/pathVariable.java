package com.Spring.Anatations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    // @PathVariable :  Bizden bir input alma anatasyonu kullanıcı bir data giriyor ve karşılık olarak onu veriyor.


@RestController
@RequestMapping("/path")
public class pathVariable {

    @GetMapping(path = "/message/{message}")
    public String myMessagePath(@PathVariable String message){
        return "Your message: "+ message;
    }

}
