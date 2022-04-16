package com.irisi.irisiclubspring.service.impl;

import com.irisi.irisiclubspring.bo.Club;
import com.irisi.irisiclubspring.dao.ClubRepository2;
import com.irisi.irisiclubspring.service.facade.ClubInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClubInterfaceImpl2 implements ClubInterface {


    private final ClubRepository2 clubRepository;

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
