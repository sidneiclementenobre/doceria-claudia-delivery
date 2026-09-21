package com.example.doceria;

import com.example.doceria.model.Product;
import com.example.doceria.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(ProductRepository repository) {
        return args -> {
            // Limpa o banco antes de inserir para não duplicar se reiniciar
            repository.deleteAll();

            // Cadastro inicial de Bolos
            repository.save(new Product(null, "Bolo de Chocolate Supremo", "Bolo caseiro com muita calda de brigadeiro belga.", 45.0, "BOLO", "/images/bolo-chocolate.jpg"));
            repository.save(new Product(null, "Bolo Red Velvet", "Massa aveludada com recheio de cream cheese.", 55.0, "BOLO", "/images/bolo-red-velvet.jpg"));

            // Cadastro inicial de Doces
            repository.save(new Product(null, "Brigadeiro Gourmet", "Cento de brigadeiro tradicional com chocolate 50%.", 80.0, "DOCE", "/images/brigadeiro.jpg"));
            repository.save(new Product(null, "Combo de Macarons", "Caixa com 6 unidades de sabores sortidos.", 35.0, "DOCE", "/images/combo-de-macarons.jpg"));

            // Cadastro inicial de Salgados
            repository.save(new Product(null, "Coxinha com Catupiry", "Massa de batata super cremosa e frango desfiado.", 6.50, "SALGADO", "/images/coxinha.jpg"));
            repository.save(new Product(null, "Empada de Palmito", "Massa que derrete na boca.", 7.00, "SALGADO", "/images/empadas.jpg"));
        };
    }
}








