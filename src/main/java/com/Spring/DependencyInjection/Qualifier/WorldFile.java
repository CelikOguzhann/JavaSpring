package com.Spring.DependencyInjection.Qualifier;

import org.springframework.stereotype.Component;


public class WorldFile implements Reader{
    @Override
    public String readFile() {
        return "World File";
    }
}
