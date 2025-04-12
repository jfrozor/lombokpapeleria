
package com.example.papeleria.Service;

import com.example.papeleria.Model.Producto;
import com.example.papeleria.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repository;

    public List<Producto> findAll() {
        return repository.findAll();
    }

    public Optional<Producto> findById(Integer id) {
        return repository.findById(id);
    }

    public Producto save(Producto entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public List<Producto> findByProveedorId(Integer idProveedor) {
        return repository.findByProveedor_IdProveedor(idProveedor);
    }

}
