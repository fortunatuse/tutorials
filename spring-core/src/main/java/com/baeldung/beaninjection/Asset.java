package com.baeldung.beaninjection;

import org.springframework.stereotype.Component;

@Component
public class Asset {

    private String name = "My Asset";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
