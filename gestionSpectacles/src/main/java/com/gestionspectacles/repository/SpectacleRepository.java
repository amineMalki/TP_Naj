package com.gestionspectacles.repository;


import com.gestionspectacles.model.Spectacle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpectacleRepository extends JpaRepository<Spectacle, Integer> {

    @Query("SELECT s FROM Spectacle s WHERE s.titre LIKE %:searchTerm%")
    public List<Spectacle> findByNameContaining(@Param("searchTerm") String searchTerm);

    @Query("SELECT s FROM Spectacle s WHERE s.type=:type")
    public List<Spectacle> getSpectacleByType(String type);

    @Query("SELECT s FROM Spectacle s WHERE s.dateSpectacle = :date")
    public List<Spectacle> findByDate(@Param("date") String date);

    @Query("SELECT s FROM Spectacle s WHERE s.prixSpectacle between 0 and :prix")
    public List<Spectacle> findByPrix(@Param("prix") Double prix);

    @Query("SELECT s FROM Spectacle s WHERE s.titre=:titre")
    Spectacle findByName(String titre);

    @Query("UPDATE Spectacle s SET s.nbPlaces = :nbPlace WHERE s.titre = :titre")
    Spectacle updateSpectacle(String titre, Integer nbPlace);

    @Query("DELETE FROM Spectacle s WHERE s.idSpectacle = :idSpectacle")
    Spectacle deleteSpectacle(Integer id);

}
