package com.example.papeleria.Model;

import jakarta.persistence.*;
        import lombok.*;

        import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;

    @OneToMany(mappedBy = "cliente")
    private List<Venta> ventas;
}

