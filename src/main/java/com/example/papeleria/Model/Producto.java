package com.example.papeleria.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    private String nombre;
    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private double precio;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;

    @OneToMany(mappedBy = "producto")
    private List<DetalleVenta> detallesVenta;
}



