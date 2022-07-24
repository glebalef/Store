package com.skypro.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping ("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }
    @GetMapping(path = "/add")
    public String add (@RequestParam(value = "id") Integer[]ids) {
        for (int i = 0; i < ids.length; i++) {
            BasketService.add(ids[i]);
        }
        return "товары добавлены";
    }

    @GetMapping (path = "/get")
    public ArrayList<Basket> get () {
        return BasketService.get();
    }
}
