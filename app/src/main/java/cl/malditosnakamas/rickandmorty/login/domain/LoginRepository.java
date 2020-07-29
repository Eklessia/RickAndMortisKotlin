package cl.malditosnakamas.rickandmorty.login.domain;

import cl.malditosnakamas.rickandmorty.login.domain.model.Usuario;
import io.reactivex.Single;

public interface LoginRepository {

    Single<Usuario> login(String rut, String clave);
}
