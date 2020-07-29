package cl.malditosnakamas.rickandmorty.registrousuario.domain;

import cl.malditosnakamas.rickandmorty.registrousuario.domain.model.RegistroUsuarioParams;
import cl.malditosnakamas.rickandmorty.registrousuario.domain.model.UsuarioRegistrado;
import io.reactivex.Single;

public class RegistrarUsuarioUseCase {

    private RegistroUsuarioRepository repository;

    public RegistrarUsuarioUseCase(RegistroUsuarioRepository repository) {
        this.repository = repository;
    }

    public Single<UsuarioRegistrado> registrarUsuario(RegistroUsuarioParams params) {
        return repository.registrarUsuario(params);
    }
}
