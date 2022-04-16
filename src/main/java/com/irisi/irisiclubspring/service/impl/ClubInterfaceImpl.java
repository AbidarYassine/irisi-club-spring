package com.irisi.irisiclubspring.service.impl;

import com.irisi.irisiclubspring.bo.Club;
import com.irisi.irisiclubspring.dao.ClubRepository;
import com.irisi.irisiclubspring.service.facade.ClubInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubInterfaceImpl implements ClubInterface {

    @Autowired
    private ClubRepository clubRepository;

    @Override
    public Club save(Club club) {
        return clubRepository.save(club);
    }

    @Override
    public Club findById(Long id) {
        return clubRepository.findById(id).orElse(null);
    }

    @Override
    public List<Club> findAll() {
        return clubRepository.findAll();
    }
}
