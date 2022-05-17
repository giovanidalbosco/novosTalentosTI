package sistema.view;

import javax.swing.*;

import sistema.controller.ListagemClienteController;
import sistema.model.TabelaClienteModel;

import java.awt.Color;
import java.awt.FlowLayout;

public class ListagemCliente extends JFrame {
    private JScrollPane jpnCenter;
    private JPanel jpnSouth = new JPanel();
    private JButton btnNew = new JButton("Novo");
    private JButton btnChange = new JButton("Alterar");
    private JButton btnDelete = new JButton("Excluir");

    private ListagemClienteController controller = new ListagemClienteController();

    private TabelaClienteModel tabelaModel = new TabelaClienteModel(controller);
    private JTable table = new JTable(tabelaModel);
    

    public ListagemCliente() {
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criaPaineis();
        criaBotoes();
        setVisible(true);
    }

    private void criaPaineis() {
        add(jpnSouth,"South"); //adiciona um painel na parte sul da janela
        jpnSouth.setBackground(Color.YELLOW); //altera a cor do fundo do painel sul
        
        jpnCenter = new JScrollPane(table); //inicializa o painel já com uma tabela inclusa
        add(jpnCenter,"Center"); //adiciona um painel na parte central da janela
        jpnCenter.setBackground(new Color(155,151,51)); //altera a cor do fundo do painel centro
        jpnCenter.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); //inclui uma barra de rolagem horizontal ao painel centro
        jpnCenter.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); //inclui uma barra de rolagem vertical ao painel centro
    }

    private void criaBotoes() {
        jpnSouth.setLayout(new FlowLayout(FlowLayout.LEFT)); //alinha os botões a esqueda da tela no painel sul

        jpnSouth.add(btnNew);
        btnNew.addActionListener(controller);
        btnNew.setName("btnNew");

        jpnSouth.add(btnChange);
        btnChange.addActionListener(controller);
        btnChange.setName("btnChange");

        jpnSouth.add(btnDelete);
        btnDelete.addActionListener(controller);
        btnDelete.setName("btnDelete");
    }

}
