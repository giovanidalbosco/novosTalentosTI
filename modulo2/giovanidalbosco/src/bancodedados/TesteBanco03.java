package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteBanco03 {
    public static void main(String[] args) {
        String stringConnection = "jdbc:mariadb://localhost/dbexercicio1";
        String usuario = "root";
        String senha = "giovani";

        try(Connection conn = DriverManager.getConnection(stringConnection, usuario, senha)) {
            String sql = "update departamento set nome = ? where codigo = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Física Aplicada");
            ps.setInt(2, 200);
            ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
