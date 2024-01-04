package com.generation.vieirajogos.service;

import com.generation.vieirajogos.model.Produto;
import com.generation.vieirajogos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Optional<Produto> curtir(Long id){

        if ((produtoRepository.existsById(id))){

            var produto = produtoRepository.findById(id).get();

            produto.setCurtir(produto.getCurtir());

            return Optional.of(produtoRepository.save(produto));
        }
        return Optional.empty();
    }
}
