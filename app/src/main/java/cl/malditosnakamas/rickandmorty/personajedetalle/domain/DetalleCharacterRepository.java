package cl.malditosnakamas.rickandmorty.personajedetalle.domain;

import cl.malditosnakamas.rickandmorty.personajedetalle.domain.model.DetalleCharacter;
import io.reactivex.Single;

public interface DetalleCharacterRepository {

    Single<DetalleCharacter> getDetailsCharacter(int id);
}
