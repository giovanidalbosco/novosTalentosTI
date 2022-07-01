package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteBanco02 {
    public static void main(String[] args) {
        var stringConnection = "jdbc:mariadb://localhost/dbexercicio1";
        var usuario = "root";
        var senha = "giovani";

        try (Connection conn = DriverManager.getConnection(stringConnection, usuario, senha)) {
            var sql = "insert into aluno(nome) values(?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Maga Patalógica");
            var numerolinhasafetadas = ps.executeUpdate();
            System.out.println(numerolinhasafetadas);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
