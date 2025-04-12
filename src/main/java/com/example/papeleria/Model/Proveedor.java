package com.example.papeleria.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProveedor;

    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;

    @OneToMany(mappedBy = "proveedor")
    private List<Producto> productos;
}
