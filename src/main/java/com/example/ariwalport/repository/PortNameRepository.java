package com.example.ariwalport.repository;

import com.example.ariwalport.entity.PortNameEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PortNameRepository extends CrudRepository<PortNameEntity,Long> {
    PortNameEntity findById(long id);
    ArrayList<PortNameEntity> findAll ();
}
