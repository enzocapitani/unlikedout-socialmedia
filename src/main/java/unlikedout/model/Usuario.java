package unlikedout.model;

public class Usuario {

    private String id, username, tag, senha;
    private int seguidores, posts, seguindo;


    public Usuario(){}

    public Usuario(String username, String tag, String senha){
        this.username = username;
        this.tag = tag;
        this.senha = senha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public int getSeguindo() {
        return seguindo;
    }

    public void setSeguindo(int seguindo) {
        this.seguindo = seguindo;
    }
}
