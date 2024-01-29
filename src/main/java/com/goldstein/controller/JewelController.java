package com.goldstein.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import products.Jewel;
import services.JewelService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/jewel")
public class JewelController implements JewelService {
    private final JewelService jewelService;

    public JewelController (JewelService jewelService){
        this.jewelService = jewelService;
    }

    // Returns all the jewels kept in the database
    @RequestMapping(method = RequestMethod.GET, path = {"/list"})
    public ResponseEntity<List<Jewel>>jewelsList (){

        List<Jewel> jewels = jewelService.jewelsList();

        return new ResponseEntity<>(jewels, HttpStatus.OK);
    }


}
