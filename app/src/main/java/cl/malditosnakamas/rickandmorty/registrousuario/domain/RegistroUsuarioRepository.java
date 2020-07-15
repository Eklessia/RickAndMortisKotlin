package cl.malditosnakamas.rickandmorty.registrousuario.domain;

import cl.malditosnakamas.rickandmorty.registrousuario.domain.model.RegistroUsuarioParams;
import cl.malditosnakamas.rickandmorty.registrousuario.domain.model.UsuarioRegistrado;
import io.reactivex.Single;

public interface RegistroUsuarioRepository {
    Single<UsuarioRegistrado> registrarUsuario(RegistroUsuarioParams registroUsuarioParams);
}
