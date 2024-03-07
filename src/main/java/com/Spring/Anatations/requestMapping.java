package com.Spring.Anatations;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    //   RequestMapping  = bizim localhost http adresindeki path yerini belli etmemizi sağlıyor.


@RestController
@RequestMapping("/request")   // locahost:8080/request
public class requestMapping {


    public String sayHello(){
        return "Hello!";
    }

}
