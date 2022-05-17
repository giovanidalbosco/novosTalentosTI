package sistema.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

//inicio teste GridBagLayout
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import sistema.controller.ListagemClienteController;

//fim teste GridBagLayout

public class FormularioCliente extends JDialog {
    private JPanel jpnCentro = new JPanel();
    private JPanel jpnBotao = new JPanel();
    private JButton btnOK = new JButton("OK");
    private JButton btnCancelar = new JButton("Cancelar");
    private JTextField txtId = new JTextField(10);
    private JTextField txtNome = new JTextField(10);
    private JTextField txtCPF = new JTextField(10);
    private JTextField txtDataNascimento = new JTextField(4);
    
    //inicio teste GridBagLayout
    private JPanel pane = new JPanel(new GridBagLayout());
    private GridBagConstraints c = new GridBagConstraints();
    
    private ListagemClienteController controller = new ListagemClienteController();
    
    //fim teste GridBagLayout

    public FormularioCliente() {
        setSize(400,300);
        setModal(true);
        criarPaineis(); //não esquece de chamar o metodo aqui!!!
        criarBotoes();
        setVisible(true);
    }
    
    private void criarPaineis() {
        /*
        add(jpnBotao,"South");
        jpnBotao.add(btnOK);
        jpnBotao.add(btnCancelar);

        //usar o java.awt.GridBagLayout
        
        add(jpnCentro,"Center");
        
        jpnCentro.add(new JLabel("Código: ")); //normalmente não é feito assim. Está sendo feito assim para ganhar tempo no exercicio
        jpnCentro.add(txtId);

        jpnCentro.add(new JLabel("Nome: "));
        jpnCentro.add(txtNome);

        jpnCentro.add(new JLabel("CPF: "));
        jpnCentro.add(txtCPF);

        jpnCentro.add(new JLabel("Data Nascimento: "));
        jpnCentro.add(txtDataNascimento);
        */

        //inicio teste GridBagLayout
        add(pane,"Center");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5,5,5,5);

        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.1; 
        pane.add(new JLabel("Código: "), c);

        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0.1; 
        pane.add(txtId, c);

        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0.1; 
        pane.add(new JLabel("Nome: "), c);

        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0.1; 
        pane.add(txtNome, c);

        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0.1; 
        pane.add(new JLabel("CPF: "), c);

        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 0.1; 
        pane.add(txtCPF, c);

        c.gridx = 0;
        c.gridy = 3;
        c.weightx = 0.1; 
        pane.add(new JLabel("Data Nascimento: "), c);

        c.gridx = 1;
        c.gridy = 3;
        c.weightx = 0.1; 
        pane.add(txtDataNascimento, c);
        
        //fim teste GridBagLayout
    }
    
    //inicio testes
    private void criarBotoes() {
        add(jpnBotao,"South");
        jpnBotao.add(btnOK);
        btnOK.addActionListener(controller);
        btnOK.setName("btnOK");

        jpnBotao.add(btnCancelar);
        btnCancelar.addActionListener(controller);
        btnCancelar.setName("btnCancelar");


    }
        
    //fim testes
    
}
