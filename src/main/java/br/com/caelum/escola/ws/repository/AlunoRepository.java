package br.com.caelum.escola.ws.repository;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import br.com.caelum.escola.ws.model.Aluno;

public class AlunoRepository {
	
	

	private final List<Aluno> alunos = new ArrayList<Aluno>();
	
	public AlunoRepository() {
		super();
		List<Aluno> bd = new ArrayList<Aluno>();
		bd.add(new Aluno(1,"Joao"));
		bd.add(new Aluno(2,"Andrey"));
		this.alunos.addAll(bd);
	}
	
	
	public void save(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public List<Aluno> findAll() {
		return this.alunos;
	}

	public Aluno findById(Long id) {
		return this.alunos.stream().filter(aluno -> id.equals(aluno.getId())).findFirst().orElseThrow(() -> new RuntimeErrorException(null, "Problema ao encontrar o aluno"));
	}
	
	public void delete(Long id) {
		Aluno aluno = this.findById(id);
		this.alunos.remove(aluno);
	}


}
