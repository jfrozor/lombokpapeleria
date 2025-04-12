
package com.example.papeleria.Controller;

import com.example.papeleria.Model.Cliente;
import com.example.papeleria.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    // Obtener todos los clientes
    @GetMapping
    public List<Cliente> getAll() {
        return service.findAll();
    }

    // Obtener un cliente por su ID
    @GetMapping("/{id}")
    public Optional<Cliente> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    // Crear un nuevo cliente
    @PostMapping
    public Cliente create(@RequestBody Cliente entity) {
        return service.save(entity);
    }

    // Actualizar un cliente existente
    @PutMapping("/{id}")
    public Cliente update(@PathVariable Integer id, @RequestBody Cliente entity) {
        entity.setIdCliente(id);
        return service.save(entity);
    }

    // Eliminar un cliente
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}