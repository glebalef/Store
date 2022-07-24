package com.skypro.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping ("/store")
public class GoodsController {

    private final GoodsController goodsController;

    public GoodsController(GoodsController goodsController) {
        this.goodsController = goodsController;
    }

    @GetMapping(path = "/add")
    public String add (@RequestParam(value = "id") Integer id) {
        GoodsService.add(id);
        return "товар с номером "+id+" добавлен";
    }

    @GetMapping (path = "/get")
    public ArrayList<Goods> get () {
        return GoodsService.get();
    }
}
