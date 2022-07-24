package com.skypro.store;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;

@Service
@Scope("prototype")
public class GoodsService {
    static ArrayList <Goods> basket = new ArrayList<Goods>();

    public static void add (Integer id) {
        Goods purchase = new Goods(id);
        basket.add(purchase);
    }

    public static ArrayList get () {
        return basket;
    }
}
