package br.univille.novostalentos.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.novostalentos.entity.Cliente;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    
    @GetMapping
    public ModelAndView index() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        Cliente cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Luizinho");
        cliente1.setEndereco("Rua lelele");
        cliente1.setSexo("Masculino");

        Cliente cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Mariazinha");
        cliente2.setEndereco("Rua lululu");
        cliente2.setSexo("Feminino");

        Cliente cliente3 = new Cliente();
        cliente3.setId(3);
        cliente3.setNome("Zezinho");
        cliente3.setEndereco("Rua lalala");
        cliente3.setSexo("Masculino");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);

        return new ModelAndView("cliente/index", "listaClientes", listaClientes);
    }
}