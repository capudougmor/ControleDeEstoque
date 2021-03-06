package H.ControleDeEstoqueApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void inserir(@RequestBody Produto produto) {
		produtoService.inserir(produto);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void alterar(@RequestBody Produto produto) {
		produtoService.alterar(produto);
	}

	@DeleteMapping
	@RequestMapping("{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deletar(@PathVariable Long id) {
		produtoService.excluir(id);
	}


}
