package br.univille.novostalentos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.novostalentos.entity.Venda;
import br.univille.novostalentos.repository.VendaRepository;
import br.univille.novostalentos.service.VendaService;

@Service
public class VendaServiceImpl implements VendaService {

    @Autowired
    private VendaRepository repositorio;

    @Override
    public List<Venda> getAll() {
        return repositorio.findAll();
    }
    
}
