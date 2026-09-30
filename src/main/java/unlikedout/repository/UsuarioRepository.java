package unlikedout.repository;

import unlikedout.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioRepository {

    private final Connection connection;

    public UsuarioRepository(Connection connection){
        this.connection = connection;
    }

    public void salvar(Usuario usuario) throws SQLException {
        String sql = """
                INSERT INTO usuarios (username, tag, senha)
                VALUES (?, ?, ?);
                """;

        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, usuario.getUsername());
            statement.setString(2, usuario.getTag());
            statement.setString(3, usuario.getSenha());

            statement.executeUpdate();
        }


    }

}
