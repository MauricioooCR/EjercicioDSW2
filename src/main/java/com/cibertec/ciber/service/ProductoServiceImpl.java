package com.cibertec.ciber.service;

import java.util.List;

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
}
