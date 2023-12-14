package com.genaration.vieirajogos.repository;

import com.genaration.vieirajogos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    public List<Categoria> findAllByGeneroContainingIgnoreCase(@Param("genero") String genero);
}
