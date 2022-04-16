package com.irisi.irisiclubspring.dao.impl;

import com.irisi.irisiclubspring.bo.Club;
import com.irisi.irisiclubspring.dao.ClubRepository2;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class ClubRepositoryImpl implements ClubRepository2 {
    @Override
    public Club save(Club club) {
        return club;
    }

    @Override
    public Optional<Club> findById(Long id) {
        return Optional.of(new Club());
    }

    @Override
    public List<Club> findAll() {
        return Collections.emptyList();
    }
}
