
package com.example.papeleria.Service;

import com.example.papeleria.Model.DetalleVenta;
import com.example.papeleria.Repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaService {

    @Autowired
    private DetalleVentaRepository repository;

    public List<DetalleVenta> findAll() {
        return repository.findAll();
    }

    public Optional<DetalleVenta> findById(Integer id) {
        return repository.findById(id);
    }

    public DetalleVenta save(DetalleVenta entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
    public List<DetalleVenta> findByEmpleadoAndCliente(Integer idEmpleado, Integer idCliente) {
        return repository.findByEmpleadoAndCliente(idEmpleado, idCliente);
    }

}
