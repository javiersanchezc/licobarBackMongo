package com.jscoder.app.service.impl;



import com.jscoder.app.repository.Dao.CategoriaRepositoryDao;
import com.jscoder.app.repository.entity.categorias;
import com.jscoder.app.service.IcategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class categoriaServiceimpl implements IcategoriaService {

    @Autowired
    CategoriaRepositoryDao categoriaRepositoryDao;
    @Override
    public List<categorias> findall() {
        return (List<categorias>) categoriaRepositoryDao.findAll();
    }




    @Override
    public void delete(categorias categorias) {

    }
}
