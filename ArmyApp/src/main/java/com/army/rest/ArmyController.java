package com.army.rest;

import com.army.model.Army;
import com.army.service.IArmyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArmyController
{
    @Autowired
    private IArmyService service;
    @PostMapping("/reg-army")
    public ResponseEntity<Army> regArmy(@RequestBody Army army)
    {
        Army army1=service.registerArmy(army);
        return new ResponseEntity<Army>(army1 , HttpStatus.CREATED);
    }

    @GetMapping("/get-all-army")
    public ResponseEntity<List<Army>> getAllArmy()
    {
        List<Army> armyList =service.getAllArmy();
        return new ResponseEntity<List<Army>>(armyList , HttpStatus.OK);
    }

    @GetMapping("/get-one-army/{id}")
    public ResponseEntity<Army> getArmyById(@PathVariable("id") Integer id)
    {
       Army army=service.getArmyById(id);
       return new ResponseEntity<>(army,HttpStatus.OK);
    }
}
