package unlikedout.repository;

import unlikedout.dto.UsuarioResponseDTO;
import unlikedout.dto.UsuarioSensitiveDTO;
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

    public void deletarUsuario(String tag) throws SQLException {
        String sql = """
                DELETE FROM usuarios
                WHERE tag = ?;
                """;

        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, tag);
            int linhasAfetadas = statement.executeUpdate();

            if(linhasAfetadas > 0){
                System.out.println("Usuario deletado com sucesso!");
            } else {
                System.out.println("Usuário nao encontrado");
            }

        }
    }

    public UsuarioResponseDTO encontrarUsuario(String tag) throws SQLException{
        String sql = """
                SELECT username, tag, seguidores, posts, seguindo FROM usuarios
                WHERE tag = ?;
                """;

        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, tag);

            try(ResultSet result = statement.executeQuery()){
                result.next();
                return new UsuarioResponseDTO(
                        result.getString("username"),
                        result.getString("tag"),
                        result.getInt("seguidores"),
                        result.getInt("posts"),
                        result.getInt("seguindo")
                );

            }

        }

    }

    // Senha vem criptografada do banco
    public UsuarioSensitiveDTO encontrarDadosSensiveis(String tag) throws SQLException{
        String sql = """
                SELECT senha FROM usuarios
                WHERE tag = ?;
                """;

        try(PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, tag);

            ResultSet result = statement.executeQuery();

            if(result.next()){
                return new UsuarioSensitiveDTO(tag, result.getString("senha"));
            } else {
                return null;
            }
        }

    }

    public void alterarCredenciais(Usuario request, String tag) throws SQLException{
        String sql = """
                UPDATE usuarios
                SET username = ?, tag = ?, senha = ?
                WHERE tag = ?; 
                """;

        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, request.getUsername());
            statement.setString(2, request.getTag());
            statement.setString(3, request.getSenha());
            statement.setString(1, tag);

            if(statement.executeUpdate() > 0){
                System.out.println("Usuario Alterado com sucesso¹");
            } else{
                System.out.println("Usuario não encontrado");
            }

        }

    }

}
