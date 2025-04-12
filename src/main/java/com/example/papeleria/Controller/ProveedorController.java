
package com.example.papeleria.Controller;

import com.example.papeleria.Model.Proveedor;
import com.example.papeleria.Service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/proveedor")
public class ProveedorController {

    @Autowired
    private ProveedorService service;

    @GetMapping
    public List<Proveedor> getAll() {
        return service.findAll();
    }

    @GetMapping("/Proveedor")
    public Optional<Proveedor> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Proveedor create(@RequestBody Proveedor entity) {
        return service.save(entity);
    }

    @PutMapping("/Proveedor")
    public Proveedor update(@PathVariable Integer id, @RequestBody Proveedor entity) {
        entity.setIdProveedor(id);
        return service.save(entity);
    }

    @DeleteMapping("/Proveedor")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
