package com.tw.apistackbase.controller;

import com.tw.apistackbase.Service.ProsecutorService;
import com.tw.apistackbase.entity.Prosecutor;
import com.tw.apistackbase.repository.ProsecutorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProsecutorController {
    @Autowired
    ProsecutorService prosecutorService;

    @GetMapping(path = "/prosecutors")
    public List<Prosecutor> getAllProsecutor(){
        return prosecutorService.getAll();
    }

    @PostMapping(headers = {"Content-type=application/json"})
    public ResponseEntity addProsecutor(Prosecutor prosecutor){
        if (prosecutorService.save(prosecutor))
            return new ResponseEntity<>(HttpStatus.CREATED);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }
}
