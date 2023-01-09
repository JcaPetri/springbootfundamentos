package com.springbootfundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class CompIntImpleDos implements CompInt {
    @Override
    public void chau() {
        System.out.println("Chau desde component implement dos");
    }
}
