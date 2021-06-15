package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {

    public Connection getConnection() {
        
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/calcmarket", "root", "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
