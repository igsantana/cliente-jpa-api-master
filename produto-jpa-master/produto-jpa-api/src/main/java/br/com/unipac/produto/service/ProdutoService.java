package br.com.unipac.produto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.unipac.produto.domain.Produto;

public interface ProdutoService {
	Produto save(Produto produto);

	List<Produto> listAll();

	Produto update(Long id, Produto produto);

	Optional<Produto> findById(Long id);

	void remove(Long id);

	List<Produto> findByNome(String name);

	Page<Produto> findAllPageable(Pageable pageable);
}
