package sistema;

import java.sql.SQLException;

import sistema.dao.ConexaoDB;
import sistema.view.ListagemCliente;

public class App3 {
    public static void main(String[] args) {
        ListagemCliente listagem = new ListagemCliente();
        
        /*
        //var connB = new ConexaoDB(); não é possivel instanciar desta forma porque o construtor da classe é privado
        //para instanciar é necessário fazer conforme abaixo. este design pattern garante que teremos uma unica conexão ao banco
        try {
            var connDB = ConexaoDB.getInstance();
            System.out.println(connDB);

            var connDB2 = ConexaoDB.getInstance();
            System.out.println(connDB2);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        
    }
}
