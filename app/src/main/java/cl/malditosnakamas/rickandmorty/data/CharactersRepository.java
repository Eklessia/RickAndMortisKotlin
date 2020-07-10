package cl.malditosnakamas.rickandmorty.data;

import cl.malditosnakamas.rickandmorty.model.Characters;
import io.reactivex.Single;

public interface CharactersRepository {
    Single<Characters> getAll();
}
