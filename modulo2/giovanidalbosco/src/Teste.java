import introducao.telas.Telinha1;

import java.awt.event.*;  
import javax.swing.*;
import java.awt.*;

public class Teste {  
    public static void main(String[] args) {  
        Telinha1 teste = new Telinha1();
        teste.setTitle("teste");
        final JTextField tf1 = new JTextField();  
        tf1.setBounds(50,50, 150,20);  
        JButton b1 = new JButton("Click Here");  
        b1.setBounds(50,100,95,30);  
        b1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                JFrame tela = new JFrame("Nova tela");
                tela.setSize(300,300);
                tela.setVisible(true);
                JTextArea cliente = new JTextArea("Cliente:");
                cliente.setBounds(200,100,70,30);
                cliente.setBackground(Color.darkGray);
                tela.add(cliente);
                JTextField nomeCliente = new JTextField();
                nomeCliente.setBounds(80,100,70,30);
                nomeCliente.setBackground(Color.darkGray);
                tela.add(nomeCliente);
                tf1.setText("Welcome to Javatpoint.");
            }
        });  
        teste.add(b1);
        teste.add(tf1);  
    }
}