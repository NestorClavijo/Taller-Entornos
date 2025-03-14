package com.entornos.taller.service;

import com.entornos.taller.modelos.Producto;
import com.entornos.taller.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements ProductoServiceInterface{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto nuevoProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto buscarProducto(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto actualizarProducto(Long id, Producto producto) {
        if (productoRepository.existsById(id)) {
            producto.setId(id);
            return productoRepository.save(producto);
        }
        return null;
    }

    @Override
    public int borrarProducto(Long id) {
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return 1;
        }
        return 0;
    }
}
