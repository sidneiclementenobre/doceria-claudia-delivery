package com.example.doceria.controller;

import com.example.doceria.model.Product;
import com.example.doceria.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // Esse método escuta quando alguém acessa http://localhost:8080/
    @GetMapping("/")
    public String index(Model model) {
        // Busca todos os bolos, doces e salgados do banco de dados
        List<Product> products = productRepository.findAll();
        
        // Envia a lista de produtos para o HTML do Thymeleaf
        model.addAttribute("products", products);
        
        // Retorna o arquivo index.html que está na pasta templates
        return "index";
    }
}
