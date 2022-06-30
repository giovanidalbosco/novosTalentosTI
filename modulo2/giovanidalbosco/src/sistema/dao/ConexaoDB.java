package sistema.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private Connection conn;
    private String stringConnection = "jdbc:mariadb://localhost/dbsistema";
    private String usuario = "root";
    private String senha = "giovani";
    private static ConexaoDB instance;
    
    private ConexaoDB() throws SQLException {
        this.conn = DriverManager.getConnection(stringConnection, usuario, senha);
    }

    public static ConexaoDB getInstance() throws SQLException {
        if(instance == null) {
            instance = new ConexaoDB();
        }
        return instance;
    }

    public Connection getConn() {
        return this.conn;
    }
}
