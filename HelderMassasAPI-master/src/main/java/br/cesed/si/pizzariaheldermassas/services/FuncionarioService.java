package br.cesed.si.pizzariaheldermassas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.si.pizzariaheldermassas.models.Funcionario;
import br.cesed.si.pizzariaheldermassas.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	//para salvar o funcionario
	public void createFuncionario(Funcionario fun) {
		funcionarioRepository.save(fun);
	}
	
	//para listar todos os funcionarios
	public List<Funcionario> listarFuncionarios(){
		return funcionarioRepository.findAll();
	}
	
	//procurar funcionario por id
	public Funcionario procurarFuncionarioPorId(Long funid) {
		return funcionarioRepository.findById(funid).get();

	}
	//atualizar funcionario
	public void updateFuncionario(Funcionario fun) {
		funcionarioRepository.save(fun);
	}
	
	//deletar funcionario
	public void deletarFuncionario(Long id) {
		funcionarioRepository.deleteById(id);
	}
	
	//criando nosso método pelo repository
	public List<Funcionario> findByNome(String nome) {
		return funcionarioRepository.findByNome(nome);
	}
}
