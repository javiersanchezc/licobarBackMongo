package com.jscoder.app.controller;


import com.jscoder.app.repository.Dao.CategoriaRepositoryDao;
import com.jscoder.app.repository.entity.categorias;
import com.jscoder.app.service.IcategoriaService;
import com.jscoder.app.service.impl.categoriaServiceimpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Api(value = "Users microservice", description = "This API has a CRUD for users")
public class categoriacontroller {
    @Autowired
//private categoriaServiceimpl categoriaserviceimpl;
    private CategoriaRepositoryDao repo;






    @GetMapping("/categoria")
    @ApiOperation(value = "Find an user", notes = "Return a user by Id" )

    public List<categorias> getAllCategory(){

        return repo.findAll();
    }

    @PostMapping("/categoria")
    public String saveCategory(@RequestBody categorias categoria){
        repo.save(categoria);
        return categoria.get_id();
    }

    @GetMapping("/findcategorias/{_id}")
    public Optional<categorias> getCategory(@PathVariable String _id) {
        return repo.findById(_id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCategoria(@PathVariable String id){
        repo.deleteById(id);
        return "category deleted with id : " + id;
    }


}
