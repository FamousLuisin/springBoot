package com.example.springBoot.model.repositories;

import com.example.springBoot.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

// DAO != Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
