package com.tw.apistackbase.Service;

import com.tw.apistackbase.entity.Prosecutor;
import com.tw.apistackbase.repository.ProsecutorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProsecutorService {
    @Autowired
    ProsecutorRepo prosecutorRepo;

    public List<Prosecutor> getAll(){
        return prosecutorRepo.findAll();
    }
}
