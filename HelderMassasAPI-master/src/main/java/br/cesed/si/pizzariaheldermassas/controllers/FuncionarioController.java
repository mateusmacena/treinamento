package br.cesed.si.pizzariaheldermassas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.si.pizzariaheldermassas.models.Funcionario;
import br.cesed.si.pizzariaheldermassas.services.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;

	@GetMapping(path = "/{id}")
	public ResponseEntity<Funcionario> procurarFuncionarioPorId(@PathVariable(name = "id") Long funid) {
		Funcionario fun = funcionarioService.procurarFuncionarioPorId(funid);
		return new ResponseEntity<Funcionario>(fun, HttpStatus.OK);
	}

	@PostMapping("/novo")
	public ResponseEntity<Funcionario> createFuncionario(@RequestBody Funcionario fun) {
		funcionarioService.createFuncionario(fun);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/atualizacao")
	public ResponseEntity<Funcionario> updateFuncionario(@RequestBody Funcionario fun) {
		return new ResponseEntity<Funcionario>(HttpStatus.OK);
	}

	@GetMapping("/todas")
	public ResponseEntity<List<Funcionario>> listarFuncionarios() {
		return new ResponseEntity<List<Funcionario>>(funcionarioService.listarFuncionarios(), HttpStatus.OK);

	}

	@DeleteMapping("/{id}/exclusao")
	public ResponseEntity<Funcionario> deletarFuncionario(@PathVariable(name = "id") Long id) {
		funcionarioService.deletarFuncionario(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
