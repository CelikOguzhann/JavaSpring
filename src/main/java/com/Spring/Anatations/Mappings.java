package com.Spring.Anatations;


import org.springframework.web.bind.annotation.*;

//  GET     :  Veriyi görüntülemek için kullanıyoruz.
    //  POST    :  Veriyi kaydetmek için kullanıyoruz.
    //  PUT     :  Veriyi güncellemek için kullanıyoruz.
    //  DELETE  :  Veriyi silmek için kullanıyoruz.
    //  PATCH   :  Verinin bir bölümünü güncellemek için kullanıyoruz..


@RestController
@RequestMapping("/mappings")
public class Mappings {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello!";
    }

    @PostMapping("/save")
    public String Save(){
        return "Data Saved!";
    }

    @DeleteMapping("delete")
    public String Delete(){
        return "Data Deleted!";

    }

}
