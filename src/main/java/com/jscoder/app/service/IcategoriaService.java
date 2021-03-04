package com.jscoder.app.service;


import com.jscoder.app.repository.entity.categorias;

import java.util.List;
import java.util.Optional;

public interface IcategoriaService {
    public List<categorias> findall();


    public void delete(categorias categorias);
}
