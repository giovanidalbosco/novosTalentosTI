package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteBanco04 {
    public static void main(String[] args) {
        String stringConnection = "jdbc:mariadb://localhost/dbexercicio1";
        String usuario = "root";
        String senha = "giovani";

        try (Connection conn = DriverManager.getConnection(stringConnection, usuario, senha)) {
            String sql = "delete from aluno where nome = 'Maga Patalógica'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }

    }
}
