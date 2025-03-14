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
@Table(name = "detalleventa")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cantidadProducto")
    private Integer cantidadProducto;

    @Column(name = "valorTotal")
    private Double valorTotal;

    @Column(name = "valorVenta")
    private Double valorVenta;

    @Column(name = "valorIva")
    private Double valorIva;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "idVenta")
    private Venta venta;
}
