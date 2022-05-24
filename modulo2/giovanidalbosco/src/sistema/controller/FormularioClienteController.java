package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.spi.NumberFormatProvider;

import javax.swing.*;

import sistema.entity.Cliente;
import sistema.view.FormularioCliente;


public class FormularioClienteController implements ActionListener{
    
    private FormularioCliente formCliente;

    public FormularioClienteController(FormularioCliente formCliente) {
        this.formCliente = formCliente;
    }
    @Override
    public void actionPerformed(ActionEvent e /*e de event*/) {
        JComponent botaoClicado = (JComponent)e.getSource();
        
        if(botaoClicado.getName().equals("btnOK")) {
            btnOKClique();
        } else {
            btnCancelarClique();
        }
        /* faz a mesma coisa que o if/else acima
        switch(botaoClicado.getName()) {
            case "btnOK":
                btnOKClique();
            break;
            case "btnCancelar":
                btnCancelarClique();
            break;
        }
        */
    }
    
    private void btnOKClique() {
        try {
            var cliente = formCliente.getCliente();
            formCliente.atualiza(cliente);
            if(validador(cliente) == true) {
                formCliente.dispose();
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo numérico não informado!");

        }
    }

    private void btnCancelarClique() {
        //JOptionPane.showMessageDialog(null, "Teste 2");
        formCliente.dispose();
    }

    private boolean validador(Cliente cliente) {
        if(cliente.getNome() == null || cliente.getNome().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome não pode ser deixado em branco!");
            return false;
        }

        return true;
    }
}
