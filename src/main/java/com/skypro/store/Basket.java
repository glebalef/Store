package com.skypro.store;

import java.util.ArrayList;
import java.util.List;


public class Basket {
    private List<Integer> basketList = new ArrayList<Integer>();

    public void add (Integer id) {
        basketList.add(id);
    }

    public List<Integer> getBasketList() {
        return basketList;
    }

    public void setBasketList(ArrayList<Integer> basketList) {
        this.basketList = basketList;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "list=" + basketList +
                '}';
    }
}
