package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.EstadoCliente;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EstadoClienteRepository extends JpaRepository <EstadoCliente, Integer> {

}
