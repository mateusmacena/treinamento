package br.cesed.si.pizzariaheldermassas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.cesed.si.pizzariaheldermassas.models.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
	List<Funcionario> findByNome(String nome);

}