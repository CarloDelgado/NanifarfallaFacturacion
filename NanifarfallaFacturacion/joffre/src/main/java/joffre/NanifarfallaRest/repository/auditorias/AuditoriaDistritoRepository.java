package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaDistrito;


@Repository
public interface AuditoriaDistritoRepository extends JpaRepository<AuditoriaDistrito, Integer> {

}
