package br.univille.novostalentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.univille.novostalentos.entity.Produto;
import br.univille.novostalentos.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoService servico;

    @GetMapping
    public ModelAndView index() {
        var listaProdutos = servico.getAll();
        return new ModelAndView("produto/index", "listaProdutos", listaProdutos);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var produto = new Produto();

        return new ModelAndView("produto/form", "produto", produto);
    }
    
    @PostMapping(params = "form")
    public ModelAndView save(Produto produto) {
        servico.save(produto);
        return new ModelAndView("redirect:/produtos");
    }

    @GetMapping("/editar/{id}")
    public ModelAndView edit(@PathVariable("id") long id) {
        Produto produto = servico.getOne(id);

        return new ModelAndView("produto/form", "produto", produto);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id) {
        servico.delete(id);

        return new ModelAndView("redirect:/produtos");
    }
    
}
