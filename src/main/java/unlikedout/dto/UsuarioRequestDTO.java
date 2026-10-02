package unlikedout.dto;

import unlikedout.model.Usuario;

public record UsuarioRequestDTO(
        String username,
        String tag,
        String senha
) {
    public static boolean temCampoVazio(UsuarioRequestDTO usuarioRequestDTO){
        return usuarioRequestDTO.username == null ||
                usuarioRequestDTO.senha == null ||
                usuarioRequestDTO.tag == null;
    }

    public static Usuario converterUsuario(UsuarioRequestDTO usuarioRequestDTO){
        return new Usuario(usuarioRequestDTO.username, usuarioRequestDTO.tag
        , usuarioRequestDTO.senha);
    }

}
