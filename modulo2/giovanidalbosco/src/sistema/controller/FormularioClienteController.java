package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.spi.NumberFormatProvider;

import javax.swing.*;

import sistema.entity.Cliente;
import sistema.exception.ValorInvalidoException;
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
            validador(cliente);
        } catch(ValorInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void btnCancelarClique() {
        //JOptionPane.showMessageDialog(null, "Teste 2");
        formCliente.dispose();
    }

    private void validador(Cliente cliente) throws ValorInvalidoException {  
        if(cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new ValorInvalidoException("O nome não pode ser deixado em branco", null, "NOME");
        }
        if(cliente.getCPF() == null || cliente.getCPF().isEmpty()) {
            throw new ValorInvalidoException("O CPF não pode ser deixado em branco", null, "CPF");
        }
        /*
        if(cliente.getDataNascimento() == null || cliente.getDataNascimento().isEmpty()) {
            throw new ValorInvalidoException("A data de nascimento não pode ser deixado em branco", null, "Data");
        }*/
        if(cliente.getId() / 1 == cliente.getId()) {
            throw new ValorInvalidoException("O ID não pode ser diferente de 5", null, "ID");
        }
    }
    //criar uma validação para cada campo de tela do cliente
    //alterar a mensagem de tela JOptionPane: transformar ela numa mensagem de erro - ok
    //mostrar o campo que gerou o erro
}
