package cl.malditosnakamas.rickandmorty.data;

import cl.malditosnakamas.rickandmorty.data.api.CharactersApi;
import cl.malditosnakamas.rickandmorty.model.Characters;
import io.reactivex.Single;

public class RemoteCharactersRepository implements CharactersRepository {

    private CharactersApi charactersApi;

    public RemoteCharactersRepository(CharactersApi charactersApi) {
        this.charactersApi = charactersApi;
    }

    @Override
    public Single<Characters> getAll() {
        return charactersApi.getCharacters();
    }
}
