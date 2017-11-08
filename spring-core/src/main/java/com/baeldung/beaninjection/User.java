package com.baeldung.beaninjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    private Asset asset;

    @Autowired
    public void setAsset(Asset asset) {
        this.asset = asset;
    }
}
