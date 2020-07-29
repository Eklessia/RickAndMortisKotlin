package cl.malditosnakamas.rickandmorty.personajes.data.remote;

import cl.malditosnakamas.rickandmorty.personajes.domain.model.Characters;
import io.reactivex.Single;
import retrofit2.http.GET;

public interface CharactersApi {

    @GET("character")
    Single<Characters> getCharacters();
}
