package introducao.telas;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import java.awt.Color;

public class Telinha1 extends JFrame{
    public Telinha1() {
        JMenuBar menuBarra = new JMenuBar();
        JMenu menu = new JMenu("Titúlo");
        JMenuItem menuItem = new JMenuItem("Abrir");
        setJMenuBar(menuBarra);
        menuBarra.add(menu);
        menu.add(menuItem);
        JLabel texto = new JLabel("Testando...");
        add(texto,"North");
        JButton botao = new JButton("Me clica!");
        //botao.setBounds(0,100,30,30);  
        add(botao,"South");
        JPanel painel = new JPanel();
        add(painel,"Center");
        painel.setBackground(Color.darkGray);
        painel.add(new JButton("Botão"));
        painel.add(new JButton("Botão"));
        painel.add(new JButton("Botão"));
        painel.add(new JButton("Botão"));

        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Telinha1 teste = new Telinha1();
        Telinha1 teste2 = new Telinha1();
        teste.setTitle("teste");
        teste2.setTitle("ficou bao"); 
    }
}
