package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Passenger;

@Repository
public interface IticketRepo extends JpaRepository<Passenger,Integer>{

}
