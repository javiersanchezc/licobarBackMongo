package com.jscoder.app.repository.Dao;


import com.jscoder.app.repository.entity.categorias;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface CategoriaRepositoryDao extends MongoRepository<categorias,String> {

    //Optional<categorias> findById(Integer id);
}
