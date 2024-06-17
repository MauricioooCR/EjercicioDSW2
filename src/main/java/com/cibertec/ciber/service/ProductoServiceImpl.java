package com.cibertec.ciber.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cibertec.ciber.entity.Producto;
import com.cibertec.ciber.repository.ProductoRepository;


@Service
public class ProductoServiceImpl implements ProductoService{
     @Autowired
    private ProductoRepository productorepository;
    @Override
    public List<Producto> listaProductos() {
        return productorepository.findAll();
    }
    @Override
    public Producto agregarActualizarProducto(Producto producto) {
        return productorepository.save(producto) ;
    }

    @Override
    public void eliminarProducto(int id) {
       productorepository.deleteById(id);
    }

    @Override
    public Optional<Producto> obtenerProductoPorId(int id) {
        return productorepository.findById(id);
    }
}
