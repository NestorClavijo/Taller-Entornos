package com.entornos.taller.controller;

import com.entornos.taller.modelos.Producto;
import com.entornos.taller.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getProductos() {
        return productoService.getProductos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> buscarProducto(@PathVariable Long id) {
        Producto producto = productoService.buscarProducto(id);
        return producto != null ? ResponseEntity.ok(producto) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Producto nuevoProducto(@RequestBody Producto producto) {
        return productoService.nuevoProducto(producto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {
        Producto productoActualizado = productoService.actualizarProducto(id, producto);
        return productoActualizado != null ? ResponseEntity.ok(productoActualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarProducto(@PathVariable Long id) {
        return productoService.borrarProducto(id) == 1 ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

}
