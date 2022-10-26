package br.univille.novostalentos.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.univille.novostalentos.entity.ItemVenda;
import br.univille.novostalentos.entity.Venda;
import br.univille.novostalentos.service.ClienteService;
import br.univille.novostalentos.service.ProdutoService;
import br.univille.novostalentos.service.VendaService;


@Controller
@RequestMapping("/vendas")
public class VendaController {
    
    @Autowired
    private VendaService servico;

    @Autowired
    private ClienteService servicoCliente;

    @Autowired
    private ProdutoService servicoProduto;

    @GetMapping
    public ModelAndView index() {
        var listaVendas = servico.getAll();
        return new ModelAndView("venda/index", "listaVendas", listaVendas);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var venda = new Venda();
        var listaClientes = servicoCliente.getAll();
        var listaProdutos = servicoProduto.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("venda", venda);
        dados.put("listaClientes", listaClientes);
        dados.put("listaProdutos", listaProdutos);
        dados.put("novoItem", new ItemVenda());
        return new ModelAndView("venda/form", dados);
    }

    @PostMapping(params = "save")
    public ModelAndView save(Venda venda) {
        servico.save(venda);

        return new ModelAndView("redirect:/vendas");
    }

    @PostMapping(params = "addItem")
    public ModelAndView adicionarItem(Venda venda, ItemVenda novoItem) {
        venda.getColItens().add(novoItem);
        var listaClientes = servicoCliente.getAll();
        var listaProdutos = servicoProduto.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("venda", venda);
        dados.put("listaClientes", listaClientes);
        dados.put("listaProdutos", listaProdutos);
        dados.put("novoItem", new ItemVenda());
        return new ModelAndView("venda/form", dados);
    }

    @PostMapping(params = "removeItem")
    public ModelAndView removeItem(@RequestParam("removeItem") int index, Venda venda) {
        venda.getColItens().remove(index);
        var listaClientes = servicoCliente.getAll();
        var listaProdutos = servicoProduto.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("venda", venda);
        dados.put("listaClientes", listaClientes);
        dados.put("listaProdutos", listaProdutos);
        dados.put("novoItem", new ItemVenda());
        return new ModelAndView("venda/form", dados);
    }

    // @GetMapping("/editar/{id}")
    // public ModelAndView edit(@PathVariable("id") long id) {
    //     var venda = servico.getOne(id);
    //     var listaClientes = servicoCliente.getAll();
    //     var listaProdutos = servicoProduto.getAll();
    //     HashMap<String, Object> dados = new HashMap<>();
    //     dados.put("venda", venda);
    //     dados.put("listaClientes", listaClientes);
    //     dados.put("listaProdutos", listaProdutos);
    //     return new ModelAndView("venda/form", dados);
    // }
    
}
