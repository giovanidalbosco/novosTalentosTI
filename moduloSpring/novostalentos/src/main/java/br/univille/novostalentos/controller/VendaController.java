package br.univille.novostalentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.novostalentos.service.VendaService;

@Controller
@RequestMapping("/vendas")
public class VendaController {
    
    @Autowired
    private VendaService servico;

    @GetMapping
    public ModelAndView index() {
        var listaVendas = servico.getAll();
        return new ModelAndView("venda/index", "listaVendas", listaVendas);
    }
}
