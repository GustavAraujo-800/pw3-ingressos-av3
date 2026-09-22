package br.com.etechoracio.ingresso.repository;

import br.com.etechoracio.ingresso.entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, Long> {
    @Query("SELECT sl FROM Sala sl join fetch sl.sala WHERE sl.sala.id = :idSala" +
            " AND s.data >= :date AND s.dataExclusao IS NULL")
    List<Sala> findBySalaAtivo();
}
