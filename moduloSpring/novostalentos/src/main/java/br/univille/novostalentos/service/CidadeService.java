package br.univille.novostalentos.service;

import java.util.List;

import br.univille.novostalentos.entity.Cidade;

public interface CidadeService {
    List<Cidade> getAll();

    Cidade save(Cidade cidade);

    Cidade getOne(long id);

    void delete(long id);
}
