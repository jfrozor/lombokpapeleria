
package com.example.papeleria.Service;

import com.example.papeleria.Model.Venta;
import com.example.papeleria.Repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository repository;

    public List<Venta> findAll() {
        return repository.findAll();
    }

    public Optional<Venta> findById(Integer id) {
        return repository.findById(id);
    }

    public Venta save(Venta entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public List<Venta> findByEmpleadoId(Integer idEmpleado) {
        return repository.findByEmpleado_IdEmpleado(idEmpleado);
    }

    public List<Venta> findByEmpleadoAndCliente(Integer idEmpleado, Integer idCliente) {
        return repository.findByEmpleado_IdEmpleadoAndCliente_IdCliente(idEmpleado, idCliente);
    }


}
