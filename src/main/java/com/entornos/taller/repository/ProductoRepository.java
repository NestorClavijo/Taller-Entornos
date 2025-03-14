package com.entornos.taller.repository;

import com.entornos.taller.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
