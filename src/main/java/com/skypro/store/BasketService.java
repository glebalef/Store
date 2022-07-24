package com.skypro.store;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@Service
@Scope (scopeName = "prototype")
public class BasketService {

    private final static Basket basket = new Basket();
    public static void add (Integer id) {
    basket.add(id);
    }
    public static ArrayList get () {
        return (ArrayList) basket.getBasketList();
    }
}
