package br.com.caelum.estoque.ws;

import java.util.Arrays;

import javax.jws.WebService;

import br.com.caelum.estoque.ws.model.Filtros;
import br.com.caelum.estoque.ws.model.Item;

@WebService(endpointInterface = "br.com.caelum.estoque.ws.EstoqueWS",serviceName = "EstoqueWS")
public class EstoqueWSImpl implements EstoqueWS {

	public ListaItens todosOsItens(Filtros filtros) {
	    System.out.println("Chamando todos os Itens");
	    ListaItens listaItens = new ListaItens();
	    listaItens.item = Arrays.asList(geraItem());
	    return listaItens;
	}

	public CadastrarItemResponse cadastrarItem(CadastrarItem parameters) throws AutorizacaoFault {
	    System.out.println("Chamando cadastarItem");
	    CadastrarItemResponse resposta = new CadastrarItemResponse();
	    return resposta;
	}

	//método auxiliar
	private Item geraItem() {
	    Item item = new Item();
	    item.codigo = "MEA";
	    item.nome = "MEAN";
	    item.quantidade = 5;
	    item.tipo = "Livro";
	    return item;
	} 

}
