package cl.malditosnakamas.rickandmorty.login.domain;

import cl.malditosnakamas.rickandmorty.login.domain.model.Usuario;
import io.reactivex.Single;

public class LoginUseCase {

    private LoginRepository loginRepository;

    public LoginUseCase(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public Single<Usuario> doLogin(String rut, String clave){
        return loginRepository.login(rut, clave);
    }

}
