package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Colores;


@Repository
public interface ColoresRepository extends JpaRepository<Colores, Integer> {

}
