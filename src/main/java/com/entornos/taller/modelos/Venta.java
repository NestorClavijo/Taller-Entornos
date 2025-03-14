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
@Table(name = "venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ivaVenta")
    private Double ivaVenta;

    @Column(name = "totalVenta")
    private Double totalVenta;

    @Column(name = "valorVenta")
    private Double valorVenta;


    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}
