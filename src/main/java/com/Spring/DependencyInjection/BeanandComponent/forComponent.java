package com.Spring.DependencyInjection.BeanandComponent;

import org.springframework.stereotype.Component;

    // Component : Spring Component anatosyonunu gördüğünde İOC da bir sınıfın bir nesnesini oluşturuyor ve sonrasında Autowired ile eşleyebiliyoruz.
    //   NOT   : Sınıf düzeyinde kullanılır. Bean gibi metod düzeyinde değil.


@Component
public class forComponent {

    public String Component(){
        return "For Component";
    }


}
