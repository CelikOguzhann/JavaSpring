package com.Spring.Anatations;

import org.springframework.web.bind.annotation.*;


    //  @RequestParam : PathVariable'den farklı olarak bir key veriyoruz ve ona karşılık alıyoruz.

@RequestMapping("/Param")
@RestController
public class requestParam {

    @GetMapping(path = "/message")
    public String myMessageParam(@RequestParam String message){
        return "Your message: "+ message;
    }
}
