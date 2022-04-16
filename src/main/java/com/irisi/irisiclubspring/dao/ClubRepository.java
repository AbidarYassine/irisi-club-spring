package com.irisi.irisiclubspring.dao;

import com.irisi.irisiclubspring.bo.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {

    Optional<Club> findByNameAndLogo(String name, String logo);

    int countAllByName(String name);

    @Query(value = "SELECT c FROM Club c WHERE c.name=:name ")
    Optional<Club> getClubByNameUsingParam(@Param("name") String name);

    @Query("SELECT c FROM Club c WHERE c.name = ?1")
    Optional<Club> getClubByName(String name);

    @Query(value = "SELECT * from clubs where name=:name", nativeQuery = true)
    Optional<Club> getClubByNameNativeQuery(@Param("name") String name);

}