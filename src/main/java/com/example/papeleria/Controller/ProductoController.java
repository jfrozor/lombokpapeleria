
package com.example.papeleria.Controller;

import com.example.papeleria.Model.Producto;
import com.example.papeleria.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    @Autowired
    private ProductoService service;

    @GetMapping
    public List<Producto> getAll() {
        return service.findAll();
    }

    @GetMapping("/Producto")
    public Optional<Producto> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Producto create(@RequestBody Producto entity) {
        return service.save(entity);
    }

    @PutMapping("/Producto")
    public Producto update(@PathVariable Integer id, @RequestBody Producto entity) {
        entity.setIdProducto(id);
        return service.save(entity);
    }

    @DeleteMapping("/Producto")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
    @GetMapping("/proveedor/{idProveedor}")
    public List<Producto> getProductosByProveedor(@PathVariable Integer idProveedor) {
        return service.findByProveedorId(idProveedor);
    }

}
