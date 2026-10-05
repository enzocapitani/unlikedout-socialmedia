package unlikedout.controller;

import unlikedout.dto.UsuarioRequestDTO;
import unlikedout.service.UsuarioService;

public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    public void criarUsuario(UsuarioRequestDTO usuarioRequestDTO){
        usuarioService.cadastrarUsuario(usuarioRequestDTO);
    }

    public void deletarUsuario(UsuarioRequestDTO usuarioRequestDTO){
        usuarioService.deletarUsuario(usuarioRequestDTO);
    }

}
