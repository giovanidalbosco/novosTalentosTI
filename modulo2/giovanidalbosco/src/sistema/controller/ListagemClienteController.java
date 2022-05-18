package sistema.controller;

import sistema.service.ClienteService;
import sistema.view.FormularioCliente;
import sistema.entity.Cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;

public class ListagemClienteController implements ActionListener{
    private ClienteService service = new ClienteService();

    public ArrayList<Cliente> getAllClientes() {
        return service.getAllClientes();
    }

    @Override
    public void actionPerformed(ActionEvent e /*e de event*/) {
        JComponent botaoClicado = (JComponent)e.getSource();
        switch(botaoClicado.getName()) {
            case "btnNew":
                btnNovoClique();
            break;
            case "btnChange":
                btnAlterarClique();
            break;
            case "btnDelete":
                btnExcluirClique();
            break;
        }
    }
    
    private void btnNovoClique() {
        //JOptionPane.showMessageDialog(null, "Botão Novo");
        Cliente novoCliente = new Cliente();
        FormularioCliente formulario = new FormularioCliente(novoCliente);
    }
    private void btnAlterarClique() {
        JOptionPane.showMessageDialog(null, "Botão Alterar");
    }
    private void btnExcluirClique() {
        JOptionPane.showMessageDialog(null, "Botão Excluir");
    }
}
