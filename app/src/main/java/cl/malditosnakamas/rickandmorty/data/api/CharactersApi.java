package cl.malditosnakamas.rickandmorty.data.api;

import cl.malditosnakamas.rickandmorty.model.Characters;
import io.reactivex.Single;
import retrofit2.http.GET;

public interface CharactersApi {

    @GET("character")
    Single<Characters> getCharacters();
}
