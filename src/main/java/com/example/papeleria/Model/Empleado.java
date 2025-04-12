package com.example.papeleria.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpleado;

    private String nombre;
    private String cargo;
    private String telefono;

    @OneToMany(mappedBy = "empleado")
    private List<Venta> ventas;
}
