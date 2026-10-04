package unlikedout.service;

import unlikedout.dto.UsuarioRequestDTO;
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

}
