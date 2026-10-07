package unlikedout.dto;

import unlikedout.model.Usuario;

public class UsuarioRequestDTO {

    private String username, tag, senha;

    public UsuarioRequestDTO(String username, String tag, String senha){
        this.username = username;
        this.tag = tag;
        this.senha = senha;
    }

    public static boolean temCampoVazio(UsuarioRequestDTO usuarioRequestDTO){
        return usuarioRequestDTO.username == null ||
                usuarioRequestDTO.senha == null ||
                usuarioRequestDTO.tag == null;
    }

    public static Usuario converterUsuario(UsuarioRequestDTO usuarioRequestDTO){
        return new Usuario(usuarioRequestDTO.username, usuarioRequestDTO.tag
        , usuarioRequestDTO.senha);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
