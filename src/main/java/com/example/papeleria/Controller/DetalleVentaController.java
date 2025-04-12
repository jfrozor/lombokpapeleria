
package com.example.papeleria.Controller;

import com.example.papeleria.Model.DetalleVenta;
import com.example.papeleria.Service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/detalleventa")
public class DetalleVentaController {

    @Autowired
    private DetalleVentaService service;

    @GetMapping
    public List<DetalleVenta> getAll() {
        return service.findAll();
    }

    @GetMapping("/Detalle")
    public Optional<DetalleVenta> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public DetalleVenta create(@RequestBody DetalleVenta entity) {
        return service.save(entity);
    }

    @PutMapping("/Detalle")
    public DetalleVenta update(@PathVariable Integer id, @RequestBody DetalleVenta entity) {
        entity.setIdDetalle(id);
        return service.save(entity);
    }

    @DeleteMapping("/Detalle")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
    @GetMapping("/empleado/{idEmpleado}/cliente/{idCliente}")
    public List<DetalleVenta> getDetallesByEmpleadoAndCliente(@PathVariable Integer idEmpleado, @PathVariable Integer idCliente) {
        return service.findByEmpleadoAndCliente(idEmpleado, idCliente);
    }

}
