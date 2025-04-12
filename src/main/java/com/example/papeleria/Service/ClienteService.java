
package com.example.papeleria.Service;

import com.example.papeleria.Model.Cliente;
import com.example.papeleria.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Optional<Cliente> findById(Integer id) {
        return repository.findById(id);
    }

    public Cliente save(Cliente entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
