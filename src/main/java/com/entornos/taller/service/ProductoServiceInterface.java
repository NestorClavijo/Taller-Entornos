package com.entornos.taller.service;

import com.entornos.taller.modelos.Producto;

import java.util.List;

public interface ProductoServiceInterface {
    List<Producto> getProductos();

    Producto nuevoProducto(Producto producto);

    Producto buscarProducto(Long id);

    Producto actualizarProducto(Long id, Producto producto);

    int borrarProducto(Long id);
}
