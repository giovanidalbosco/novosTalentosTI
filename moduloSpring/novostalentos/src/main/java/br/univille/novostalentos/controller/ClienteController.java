package br.univille.novostalentos.controller;

import java.util.HashMap;

import javax.validation.Valid;

// import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.novostalentos.entity.Cliente;
// import br.univille.novostalentos.entity.Cliente;
import br.univille.novostalentos.repository.ClienteRepository;
import br.univille.novostalentos.service.ClienteService;
import br.univille.novostalentos.service.CidadeService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteService servico;

    @Autowired
    private CidadeService servicoCidade;

    @GetMapping
    public ModelAndView index() {
        // ArrayList<Cliente> listaClientes = new ArrayList<>();

        // Cliente cliente1 = new Cliente();
        // // cliente1.setId(1);
        // cliente1.setNome("Luizinho");
        // cliente1.setEndereco("Rua lelele");
        // cliente1.setSexo("Masculino");

        // Cliente cliente2 = new Cliente();
        // // cliente2.setId(2);
        // cliente2.setNome("Mariazinha");
        // cliente2.setEndereco("Rua lululu");
        // cliente2.setSexo("Feminino");

        // Cliente cliente3 = new Cliente();
        // // cliente3.setId(3);
        // cliente3.setNome("Zezinho");
        // cliente3.setEndereco("Rua lalala");
        // cliente3.setSexo("Masculino");

        // listaClientes.add(cliente1);
        // listaClientes.add(cliente2);
        // listaClientes.add(cliente3);

        var listaClientes = servico.getAll();
        return new ModelAndView("cliente/index", "listaClientes", listaClientes);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var cliente = new Cliente();
        var listaCidades = servicoCidade.getAll();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("cliente", cliente);
        dados.put("listaCidades", listaCidades);
        return new ModelAndView("cliente/form", dados);
    }

    @PostMapping(params = "form")
    public ModelAndView save(@Valid Cliente cliente, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            var listaCidades = servicoCidade.getAll();
            HashMap<String, Object> dados = new HashMap<>();
            dados.put("cliente", cliente);
            dados.put("listaCidades", listaCidades);
            return new ModelAndView("cliente/form", dados);
        }
        servico.save(cliente);
        
        return new ModelAndView("redirect:/clientes");
    }

    @GetMapping("/editar/{id}") 
    public ModelAndView edit(@PathVariable("id") long id) {
        var cliente = servico.getOne(id);
        var listaCidades = servicoCidade.getAll();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("cliente", cliente);
        dados.put("listaCidades", listaCidades);
        return new ModelAndView("cliente/form", dados);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id) {
        servico.delete(id);

        return new ModelAndView("redirect:/clientes");
    }
}