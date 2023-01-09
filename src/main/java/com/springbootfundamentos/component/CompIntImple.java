package com.springbootfundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class CompIntImple implements CompInt {
    @Override
    public void chau() {
        System.out.println("Chau desde mi comp via interface");
    }
}
