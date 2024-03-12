package com.matei.springboot101.services;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.util.Random;

@Service
//scope proxyMode.INTERFACES daca imi iau o interfata si proxyMode.TARGET_CLASS daca imi iau clasa direct
//creeaza proxy-uri pentru a lua infatisarea clasei de mai multe ori, dispare comportamentul de singleton
//@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.INTERFACES)
//daca folosesc SESSION instanta se creeaza o data pe sesiune, cand expira sesiunea, expira si instanta
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.INTERFACES)
public class RandomNumberService implements NumberService{

    private final int value;

    public RandomNumberService() {
        this.value = new Random().nextInt(1000);
    }

    public int getValue() {
        //new RuntimeException().printStackTrace();
        return value;
    }
}

