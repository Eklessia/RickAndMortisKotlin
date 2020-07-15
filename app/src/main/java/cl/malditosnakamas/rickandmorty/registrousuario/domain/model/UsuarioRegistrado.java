package cl.malditosnakamas.rickandmorty.registrousuario.domain.model;

public class UsuarioRegistrado {
    private String nombre;
    private String usuario;
    private String edad;

    public UsuarioRegistrado(String nombre, String usuario, String edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
