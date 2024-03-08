package com.Spring.DependencyInjection.BeanandComponent;


import org.springframework.context.annotation.Bean;

    //  Bean  :  Kendi yazmadığımız sınıflar için kullanılıyor. Yani bir class var ve biz onu İOC içinde yolluyoruz sonrasında başka yerlerden erişebiliyoruz.
    //  NOT   :  Method düzeyinde kullanılır. Component gibi sınıf düzeyinde değil.

public class forBean {

    @Bean
    public String Bean(){
        return "For Bean";
    }
}
