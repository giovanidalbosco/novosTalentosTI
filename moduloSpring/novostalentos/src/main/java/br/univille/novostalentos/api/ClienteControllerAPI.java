package br.univille.novostalentos.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.univille.novostalentos.entity.Cliente;
import br.univille.novostalentos.service.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteControllerAPI {
    
    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> getAll() {
        var listaClientes = service.getAll();
        
        return new ResponseEntity<>(listaClientes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getOne(@PathVariable("id") long id) {
        var cliente = service.getOne(id);
        if (cliente.getId() == 0) {
            return ResponseEntity.notFound().build();
        }

        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }

    @GetMapping("/nome/{busca}")
    public ResponseEntity<List<Cliente>> findByNome(@PathVariable("busca") String busca) {
        var listaClientes = service.findByNome(busca);

        return new ResponseEntity<List<Cliente>>(listaClientes, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Cliente>> findByNomeRequestParam(@RequestParam("nome") String nome) {
        var listaClientes = service.findByNome(nome);

        return new ResponseEntity<List<Cliente>>(listaClientes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {
        if(cliente.getId() == 0) {
            var novoCliente = service.save(cliente);

            return new ResponseEntity<Cliente>(novoCliente, HttpStatus.CREATED);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> edit(@PathVariable("id") long id, @RequestBody Cliente clienteMod) {
        var clienteAlt = service.getOne(id);
        if(clienteAlt.getId() == 0) {
            return ResponseEntity.notFound().build();
        }
        clienteAlt.setNome(clienteMod.getNome());
        clienteAlt.setEndereco(clienteMod.getEndereco());
        clienteAlt.setCidadeResidencia(clienteMod.getCidadeResidencia());
        clienteAlt.setDataNascimento(clienteMod.getDataNascimento());
        clienteAlt.setSexo(clienteMod.getSexo());

        service.save(clienteAlt);

        return new ResponseEntity<Cliente>(clienteAlt, HttpStatus.OK);       
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> delete (@PathVariable("id") long id) {
        var clienteAlt = service.getOne(id);
        if(clienteAlt.getId() == 0) {
            return ResponseEntity.notFound().build();
        }
        
        service.delete(id);
        return new ResponseEntity<Cliente>(clienteAlt, HttpStatus.OK); 
    }
}
