package com.Spring.DependencyInjection.Lazy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Lazy1 {

    private myComponent myComponent;

    public Lazy1(com.Spring.DependencyInjection.Lazy.myComponent myComponent) {
        this.myComponent = myComponent;
    }
}
