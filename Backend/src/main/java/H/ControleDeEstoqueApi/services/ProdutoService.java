package H.ControleDeEstoqueApi.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import H.ControleDeEstoqueApi.models.Produto;

@Service
public class ProdutoService {

	public List<Produto> findAll() {
		List<Produto> listaProduto = new ArrayList<Produto>();
		Produto p1 = new Produto(1, "Descricao1", new Date(), "1234567", true);
		Produto p2 = new Produto(2, "Descricao2", new Date(), "1234567", true);
		listaProduto.add(p1);
		listaProduto.add(p2);
		return listaProduto;
	}
}
