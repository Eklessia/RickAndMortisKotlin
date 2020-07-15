package cl.malditosnakamas.rickandmorty.personajes.domain;

import cl.malditosnakamas.rickandmorty.personajes.domain.model.Characters;
import io.reactivex.Single;

public interface CharactersRepository {
    Single<Characters> getAll();
}
