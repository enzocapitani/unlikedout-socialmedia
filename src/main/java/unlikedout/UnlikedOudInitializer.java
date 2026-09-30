package unlikedout;

import unlikedout.config.ConnectionConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UnlikedOudInitializer {

    private Connection connection;

    public UnlikedOudInitializer(){

    }

    public void iniciar(){
        conectarBanco();
    }

    private void conectarBanco(){
        try {
            System.out.println("[LOG] Conectando ao banco de dados");
            this.connection = ConnectionConfig.getConnection();
            System.out.println("[SUCESSO] Banco de dados conectado com sucesso!");
        } catch(SQLException e){
            System.out.println("[ERROR] Erro ao conectar com o banco de dados");
            e.printStackTrace();
        }
    }

}
