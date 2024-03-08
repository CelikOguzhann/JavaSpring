package com.Spring.DependencyInjection.BeanandComponent;


import com.Spring.DependencyInjection.BeanandComponent.forBean;
import com.Spring.DependencyInjection.BeanandComponent.forComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    //  Autowired   :  Program çalıştırıldığında İOC içine oluşturulan sınıfları Autowired anatasyonu ile çağırıp ve nesneyle eşleşmesini sağlıyoruz.
    //  NOT    : Sınıf düzeyinde kullanılmaz. Sadece Method düzeyinde kullanılır.


@RestController
@RequestMapping("/Controller")
public class MyController {

    @Autowired
    private forComponent class1;

    @Autowired
    private forBean class2;


    @GetMapping("/component")
    public String getNameforComponent(){
        return class1.Component() + " " + class2.Bean();
    }
    @GetMapping("/bean")
    public String getNameforbean(){
        return class2.Bean();
    }

}
