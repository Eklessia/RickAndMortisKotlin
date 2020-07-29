package cl.malditosnakamas.rickandmorty.login.domain.model;

public class Usuario {
    private int id;
    private String urlAvatar;
    private String nombre;
    private String email;

    public Usuario(int id, String urlAvatar, String nombre, String email) {
        this.id = id;
        this.urlAvatar = urlAvatar;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrlAvatar() {
        return urlAvatar;
    }

    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
