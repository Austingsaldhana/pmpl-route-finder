package com.hvdesai.pmplroutefinder.repository;

import com.hvdesai.pmplroutefinder.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {

    List<User> findAll();

}