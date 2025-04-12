
package com.example.papeleria.Controller;

import com.example.papeleria.Model.Venta;
import com.example.papeleria.Service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/venta")
public class VentaController {

    @Autowired
    private VentaService service;

    // Listar todas las ventas
    @GetMapping
    public List<Venta> getAll() {
        return service.findAll();
    }

    // Obtener una venta por su ID
    @GetMapping("/{id}")
    public Optional<> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    // Crear una nueva vVentaenta
    @PostMapping
    public Venta create(@RequestBody Venta entity) {
        return service.save(entity);
    }

    // Actualizar una venta existente
    @PutMapping("/{id}")
    public Venta update(@PathVariable Integer id, @RequestBody Venta entity) {
        entity.setIdVenta(id);
        return service.save(entity);
    }

    // Eliminar una venta
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }

    // Listar ventas realizadas por un empleado
    @GetMapping("/empleado/{idEmpleado}")
    public List<Venta> getVentasByEmpleado(@PathVariable Integer idEmpleado) {
        return service.findByEmpleadoId(idEmpleado);
    }

    // Listar ventas que un empleado ha hecho a un cliente específico
    @GetMapping("/empleado/{idEmpleado}/cliente/{idCliente}")
    public List<Venta> getVentasByEmpleadoAndCliente(@PathVariable Integer idEmpleado, @PathVariable Integer idCliente) {
        return service.findByEmpleadoAndCliente(idEmpleado, idCliente);
    }
}