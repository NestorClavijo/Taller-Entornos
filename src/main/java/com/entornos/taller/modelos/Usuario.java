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
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numeroDocumento")
    private String numeroDocumento;

    @Column(name = "email")
    private String email;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "password")
    private String password;

    @Column(name = "nombreUsuario")
    private String nombreUsuario;

    @ManyToOne
    @JoinColumn(name = "idTipoDocumento")
    private TipoDocumento tipoDocumento;
}
