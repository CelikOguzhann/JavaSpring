package com.Spring.Anatations;


import org.springframework.web.bind.annotation.*;


    /* required  : Biz normalde PathVariable ve RequestParam ile kullanıcan veri alırken bir value vermemiz gerekiyordu.
                   Fakat required yaptığımız zaman bize null değeri döndürüyor yani bir value vermek zorunda kalmıyoruz. */


@RestController
@RequestMapping("/required")
public class required {

    @GetMapping({"/message1","/message1/{message}"})
    public String myMessage1(@PathVariable(name = "message",required = false) String message){
        return "Your message : "+ message;
    }


    @GetMapping(path = "/message2")
    public String myMessage2(@RequestParam(name = "message",required = false) String message){
        return "Your message : "+ message;
    }
}
