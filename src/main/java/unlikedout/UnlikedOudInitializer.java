package unlikedout;

import unlikedout.config.ConnectionConfig;
import unlikedout.repository.UsuarioRepository;
import unlikedout.service.UsuarioService;

import java.sql.Connection;
import java.sql.SQLException;
public class UnlikedOudInitializer {

    private Connection connection;
    private UsuarioRepository usuarioRepository;
    private UsuarioService usuarioService;

    public UnlikedOudInitializer(){
        conectarBanco();
        this.usuarioRepository = new UsuarioRepository(connection);
        this.usuarioService = new UsuarioService(usuarioRepository);
    }

    public void iniciar(){
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
