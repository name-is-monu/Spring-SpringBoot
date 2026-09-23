package com.army.service;

import com.army.model.Army;
import com.army.repo.IArmy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArmyService implements IArmyService {

    @Autowired
    private IArmy repo;

    @Override
    public Army registerArmy(Army army)
    {

        return repo.save(army);
    }

    @Override
    public List<Army> getAllArmy()
    {
        return repo.findAll();
    }

    @Override
    public Army getArmyById(Integer id)
    {
        Optional<Army> army =repo.findById(id);
        Army army1=null;
        if(army.isPresent())
            army1=army.get();
        return army1;
    }
}
