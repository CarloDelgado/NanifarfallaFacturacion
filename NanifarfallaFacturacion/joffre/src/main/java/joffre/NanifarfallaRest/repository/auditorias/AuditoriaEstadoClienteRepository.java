package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaEstadoCliente;


@Repository
public interface AuditoriaEstadoClienteRepository extends JpaRepository<AuditoriaEstadoCliente, Integer> {

}
