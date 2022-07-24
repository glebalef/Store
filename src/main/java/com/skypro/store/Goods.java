package com.skypro.store;

public class Goods {
    private Integer id;

    public Goods(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                '}';
    }
}
