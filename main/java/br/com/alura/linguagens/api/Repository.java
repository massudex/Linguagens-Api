package br.com.alura.linguagens.api;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Linguagem, String> {
    
}
