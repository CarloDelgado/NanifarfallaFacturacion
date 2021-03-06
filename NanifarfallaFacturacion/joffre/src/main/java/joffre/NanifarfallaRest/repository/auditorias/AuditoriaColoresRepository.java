package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaColores;

@Repository
public interface AuditoriaColoresRepository extends JpaRepository<AuditoriaColores, Integer> {

}
