package com.Spring.DependencyInjection.Qualifier;

import org.springframework.stereotype.Component;

@Component
public class PdfFile implements Reader{

    @Override
    public String readFile() {
        return "PDF FİLE";
    }
}
