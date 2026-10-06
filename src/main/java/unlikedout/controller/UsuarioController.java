package unlikedout.controller;

import unlikedout.dto.UsuarioRequestDTO;
import unlikedout.service.UsuarioService;

import java.sql.SQLException;

public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    public void criarUsuario(UsuarioRequestDTO usuarioRequestDTO){
        usuarioService.cadastrarUsuario(usuarioRequestDTO);
    }

    public void deletarUsuario(String tag, String senha){
        try {
            usuarioService.deletarUsuario(tag, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
