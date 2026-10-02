package unlikedout.repository;

import unlikedout.dto.UsuarioResponseDTO;
import unlikedout.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    private final Connection connection;

    public UsuarioRepository(Connection connection){
        this.connection = connection;
    }

    // Pseudo POST
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

    // Pseudo GET
    public List<UsuarioResponseDTO> findAll() throws SQLException{

        List<UsuarioResponseDTO> usuariosEncontrados = new ArrayList<>();

        String sql = """
                SELECT * FROM usuarios;
                """;

        try(PreparedStatement statement = connection.prepareStatement(sql)){

            // TODO: Adicionar clausula where para status

            try(ResultSet result = statement.executeQuery()){
                while(result.next()){

                    usuariosEncontrados.add(
                                new UsuarioResponseDTO(
                                result.getString("username"),
                                result.getString("tag"),
                                result.getInt("seguidores"),
                                result.getInt("posts"),
                                result.getInt("seguindo")
                            ));

                }
                return usuariosEncontrados;
            }
        }

    }

}
