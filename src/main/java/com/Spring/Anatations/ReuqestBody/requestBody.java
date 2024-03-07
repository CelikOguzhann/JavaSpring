package com.Spring.Anatations.ReuqestBody;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    /* RequestBody : PathVariable ve RequestParam farklı olarak biz bir obje değeri alabiliriz.
                     Bu örnekte bir json veri tipinde dizi alıyoruz. Bu objeyi geri döndürüyoruz. */


@RestController
@RequestMapping("/body")
public class requestBody {

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        System.out.println("User Saved!");
        user.setPassaword("");   // İstersek normalde şifreler gizli olduğu için burda atama olarak boşluk atatık ama farklı yapabiliriz.
        return user;
    }
}
