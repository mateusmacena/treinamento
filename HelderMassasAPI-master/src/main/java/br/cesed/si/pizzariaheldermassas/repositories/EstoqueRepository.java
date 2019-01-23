package br.cesed.si.pizzariaheldermassas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cesed.si.pizzariaheldermassas.models.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

}