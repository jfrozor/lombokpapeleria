
package com.example.papeleria.Repository;

import com.example.papeleria.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByProveedor_IdProveedor(Integer idProveedor);


}
