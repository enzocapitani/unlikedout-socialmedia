package unlikedout.service;

import unlikedout.dto.UsuarioRequestDTO;
import unlikedout.repository.UsuarioRepository;

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
        try {
            usuarioRepository.salvar(UsuarioRequestDTO.converterUsuario(usuarioRequest));
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

}
