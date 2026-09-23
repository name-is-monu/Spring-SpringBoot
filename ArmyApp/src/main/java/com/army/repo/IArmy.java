package com.army.repo;

import com.army.model.Army;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArmy extends JpaRepository<Army,Integer>
{
}
