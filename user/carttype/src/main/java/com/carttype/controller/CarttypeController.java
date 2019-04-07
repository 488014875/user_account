package com.carttype.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
@RequestMapping("/cartType")
public class CarttypeController implements ICarttypeController{
    @Override
    @RequestMapping("add")
    public String add() {
        return "123456789";
    }
}
