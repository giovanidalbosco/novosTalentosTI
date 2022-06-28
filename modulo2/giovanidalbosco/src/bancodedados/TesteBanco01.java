package bancodedados;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class TesteBanco01 {
    public static void main(String[] args) {
        //connectionstrings.com
        //string de conexão: endereço completo para chegar no banco de dados
        var stringConnection = "jdbc:mariadb://localhost/dbexercicio1";
        var usuario = "root";
        var senha = "univille";

        try (Connection conn = DriverManager.getConnection(stringConnection, usuario, senha)) {
            var sql = "select * from aluno";
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet rs = stmt.executeQuery(sql)) {
                    while (rs.next()) {
                        System.out.println(rs.getString("nome"));
                    }
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
