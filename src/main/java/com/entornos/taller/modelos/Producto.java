package com.entornos.taller.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ivaCompra")
    private Double ivaCompra;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precioCompra")
    private Double precioCompra;

    @Column(name = "precioVenta")
    private Double precioVenta;

    @ManyToOne
    @JoinColumn(name = "idProveedor")
    private Proveedor proveedor;
}
