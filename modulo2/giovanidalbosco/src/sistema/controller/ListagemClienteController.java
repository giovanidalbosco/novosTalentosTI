package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


import sistema.entity.Cliente;
import sistema.service.ClienteService;
import sistema.view.FormularioCliente;

public class ListagemClienteController implements ActionListener{
    private ClienteService service = new ClienteService();


    public ArrayList<Cliente> getAllClientes() {
        return service.getAllClientes();
    }

    @Override
    public void actionPerformed(ActionEvent e /*e de event*/) {
        JComponent botaoClicado = (JComponent)e.getSource();
        switch(botaoClicado.getName()) {
            case "btnNovo":
                btnNovoClique();
            break;
            case "btnAlterar":
                btnAlterarClique();
            break;
            case "btnExcluir":
                btnExcluirClique();
            break;
        }
    }
    
    private void btnNovoClique() {
        //JOptionPane.showMessageDialog(null, "Botão Novo");
        Cliente novoCliente = new Cliente();
        FormularioCliente formulario = new FormularioCliente(novoCliente);
        service.save(novoCliente);
        
    }
    private void btnAlterarClique() {
        JOptionPane.showMessageDialog(null, "Botão Alterar");
    }
    private void btnExcluirClique() {
        JOptionPane.showMessageDialog(null, "Botão Excluir");
    }
}
