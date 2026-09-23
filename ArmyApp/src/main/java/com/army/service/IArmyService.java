package com.army.service;

import com.army.model.Army;

import java.util.List;

public interface IArmyService
{
    Army registerArmy(Army army);
    List<Army> getAllArmy();
    Army getArmyById(Integer id);
}
