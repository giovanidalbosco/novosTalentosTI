package bancodedados;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.Connection;

public class TesteBanco01 {
    public static void main(String[] args) {
        //connectionstrings.com
        //string de conexão: endereço completo para chegar no banco de dados
        var stringConnection = "jdbc:mariadb://localhost/dbexercicio1";
        var usuario = "root";
        var senha = "giovani";

        try (Connection conn = DriverManager.getConnection(stringConnection, usuario, senha)) {
            //var sql = "select * from aluno";
            //var sql = "select * from aluno where nome like '%nho'";
            var busca = JOptionPane.showInputDialog(null, "Digite o nome procurado");
            //var sql = "select * from aluno where nome like '%" + busca + "%'"; //nunca fazer desta forma. falha de segurança grave
            
            var sql = "select * from aluno where nome like ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%"+busca+"%");
            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    System.out.print(rs.getInt("numero"));
                    System.out.println(rs.getString("nome"));
                }
            }
            
            /*
            try (Statement stmt = conn.createStatement()) { //responsável por executar consultas no banco
                //executa a query no banco de dados
                try (ResultSet rs = stmt.executeQuery(sql)) { //o executeQuery só permite comandos de select no BD
                    while (rs.next()) {
                        System.out.print(rs.getInt("numero"));
                        System.out.println(rs.getString("nome"));
                    }
                }
            }*/
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
