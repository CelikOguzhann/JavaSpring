package com.Spring.DependencyInjection.Lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


    // @Lazy  :  Bu anatosyon eğer kullanılırsa kullanılan class'ın nesnesi oluşturulmaz. Eğer bu classın nesnesine başka bir class ihtiyaç duyarsa oluşturulur.
    //        :  Yani bu classın nesnesi İOC içerisine eklenmesinden ise ihtiyaç duyulduğunda oluşturulsun diye kullanılır.

@Component
@Lazy
public class myComponent {

    public myComponent() {
        System.out.println( "MyComponent bean initialized!! ");
    }
}
