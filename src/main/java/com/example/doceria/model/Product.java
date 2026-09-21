package com.example.doceria.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_product")
@Data
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String description;
    private Double price;
    private String category; // BOLO, DOCE ou SALGADO
    private String imageUrl;

    // Construtor Padrão exigido pelo banco (NoArgsConstructor)
    public Product() {
    }

    // Construtor Completo usado no DataInitializer (AllArgsConstructor)
    public Product(Long id, String name, String description, Double price, String category, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
    }
}
