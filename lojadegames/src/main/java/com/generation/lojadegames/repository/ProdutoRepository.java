package com.generation.lojadegames.repository;

import java.util.List;
import org.springframework.data.repository.query.Param;
import com.generation.lojadegames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List <Produto> findAllBynomeContainingIgnoreCase(@Param("nome") String nome);

	

}
