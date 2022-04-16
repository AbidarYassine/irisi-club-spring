package com.irisi.irisiclubspring.service.facade;

import com.irisi.irisiclubspring.bo.Club;

import java.util.List;

public interface ClubInterface {

    Club save(Club club);

    Club findById(Long id);

    List<Club> findAll();
}
