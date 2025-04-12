
package com.example.papeleria.Repository;

import com.example.papeleria.Model.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Integer> {
    @Query("SELECT dv FROM DetalleVenta dv WHERE dv.venta.empleado.idEmpleado = :idEmpleado AND dv.venta.cliente.idCliente = :idCliente")
    List<DetalleVenta> findByEmpleadoAndCliente(@Param("idEmpleado") Integer idEmpleado, @Param("idCliente") Integer idCliente);


}
