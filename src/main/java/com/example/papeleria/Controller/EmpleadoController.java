
package com.example.papeleria.Controller;

import com.example.papeleria.Model.Empleado;
import com.example.papeleria.Service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService service;

    @GetMapping
    public List<Empleado> getAll() {
        return service.findAll();
    }

    @GetMapping("/Empleado")
    public Optional<Empleado> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Empleado create(@RequestBody Empleado entity) {
        return service.save(entity);
    }

    @PutMapping("/Empleado")
    public Empleado update(@PathVariable Integer id, @RequestBody Empleado entity) {
        entity.setIdEmpleado(id);
        return service.save(entity);
    }

    @DeleteMapping("/Empleado")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
