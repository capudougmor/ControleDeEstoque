package H.ControleDeEstoqueApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import H.ControleDeEstoqueApi.models.Produto;
import H.ControleDeEstoqueApi.services.ProdutoService;

@RestController
@RequestMapping("api/v1/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public List<Produto> findAll() {
		return produtoService.findAll();
	}


}
