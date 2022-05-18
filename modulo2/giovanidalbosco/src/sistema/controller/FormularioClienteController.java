package sistema.controller;

import sistema.view.FormularioCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

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
    
    //inicio teste
    private void btnOKClique() {
        var cliente = formCliente.getCliente();
        formCliente.atualiza(cliente);
        formCliente.dispose();
    }
    private void btnCancelarClique() {
        JOptionPane.showMessageDialog(null, "Teste 2");
    }
    //fim teste
}
