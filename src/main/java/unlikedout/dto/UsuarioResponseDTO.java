package unlikedout.dto;

import unlikedout.model.Usuario;

public record UsuarioResponseDTO(
        String username,
        String tag,
        int seguidores,
        int posts,
        int seguindo
) {

    public static Usuario convertResponse(UsuarioResponseDTO dto){
        Usuario user = new Usuario();

        user.setUsername(dto.username);
        user.setTag(dto.tag);
        user.setSeguidores(dto.seguidores);
        user.setPosts(dto.posts);
        user.setSeguindo(dto.seguindo);

        return user;
    }

}
