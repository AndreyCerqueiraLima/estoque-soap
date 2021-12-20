package br.com.caelum.escola.ws;


import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.escola.ws.model.ListaAlunos;
import br.com.caelum.escola.ws.repository.AlunoRepository;

@WebService
public class AlunoWs {
	
	private AlunoRepository repository;
	
	public AlunoWs() {
		this.repository = new AlunoRepository();
	}
	
	@WebMethod(operationName = "alunos")
	@WebResult(name = "alunos", targetNamespace = "")
	public ListaAlunos findAll(){
		ListaAlunos listaAlunos = new ListaAlunos();
		listaAlunos.setAluno(this.repository.findAll());
		return listaAlunos;
	}
	
}
