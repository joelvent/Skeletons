package com.goldstein.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import products.Product;
import services.JewelServiceImpl;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class JewelController extends JewelServiceImpl {

    @Autowired
    private JewelServiceImpl jewelServiceImpl;

    public JewelController (JewelServiceImpl jewelServiceImpl){
        this.jewelServiceImpl = jewelServiceImpl;
    }

    // Returns all the jewels kept in the database
    @RequestMapping(method = RequestMethod.GET, path = {"/list"})
    public List<Product> jewelsList (){

        List<Product> jewels = jewelServiceImpl.jewelsList();

        return new ResponseEntity<>(jewels, HttpStatus.OK);
    }

}
