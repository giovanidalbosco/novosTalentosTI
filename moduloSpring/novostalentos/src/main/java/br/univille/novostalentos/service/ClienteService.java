package br.univille.novostalentos.service;

import java.util.List;
import java.util.Optional;

import br.univille.novostalentos.entity.Cliente;

public interface ClienteService {
    List<Cliente> getAll();

    Cliente save(Cliente cliente);

    Cliente getOne(long id);

    Cliente update(Cliente cliente);

    void delete(long id);
}
