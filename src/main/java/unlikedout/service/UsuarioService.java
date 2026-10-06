package unlikedout.service;

import unlikedout.dto.UsuarioRequestDTO;
import unlikedout.dto.UsuarioSensitiveDTO;
import unlikedout.model.Usuario;
import unlikedout.repository.UsuarioRepository;

import org.mindrot.jbcrypt.BCrypt;

import java.sql.SQLException;

public class UsuarioService {

    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public void cadastrarUsuario(UsuarioRequestDTO usuarioRequest){
        if(UsuarioRequestDTO.temCampoVazio(usuarioRequest)){
            throw new RuntimeException("Erro ao adicionar usuario! Campo vazio");
        }

        Usuario usuarioNovo = UsuarioRequestDTO.converterUsuario(usuarioRequest);
        usuarioNovo.setSenha(BCrypt.hashpw(usuarioNovo.getSenha(), BCrypt.gensalt(12)));

        try {
            usuarioRepository.salvar(usuarioNovo);
        } catch (SQLException e){
            e.printStackTrace();
        }

    }


    public void deletarUsuario(String tag, String senha) throws SQLException{

        UsuarioSensitiveDTO sensiveis = usuarioRepository.encontrarDadosSensiveis(tag);

        System.out.println(senha+" "+" "+ sensiveis.senha());

        if(BCrypt.checkpw(senha, sensiveis.senha())){
            usuarioRepository.deletarUsuario(tag);
        } else {
            System.out.println("Erro ao deletar usuario, credenciais inválidas");
        }

    }

}
