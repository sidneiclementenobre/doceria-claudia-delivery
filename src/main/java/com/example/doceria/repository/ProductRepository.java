package com.example.doceria.repository;

import com.example.doceria.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // O Spring Boot gera automaticamente todas as operações de banco de dados (Salvar, Deletar, Buscar)
}
