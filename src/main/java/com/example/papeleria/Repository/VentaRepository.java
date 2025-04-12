
package com.example.papeleria.Repository;

import com.example.papeleria.Model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {
    List<Venta> findByEmpleado_IdEmpleado(Integer idEmpleado);
    List<Venta> findByEmpleado_IdEmpleadoAndCliente_IdCliente(Integer idEmpleado, Integer idCliente);


}
