package com.Spring.DependencyInjection.Qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ExcelFile implements Reader{

    @Override
    public String readFile() {
        return "EXCEL FİLE";
    }
}
