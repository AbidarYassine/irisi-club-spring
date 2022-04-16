package com.irisi.irisiclubspring.dao;

import com.irisi.irisiclubspring.bo.Club;

import java.util.List;
import java.util.Optional;


public interface ClubRepository2 {
    Club save(Club club);

    Optional<Club> findById(Long id);

    List<Club> findAll();

}