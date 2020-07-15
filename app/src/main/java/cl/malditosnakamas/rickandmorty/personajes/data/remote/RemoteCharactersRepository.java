package cl.malditosnakamas.rickandmorty.personajes.data.remote;

import cl.malditosnakamas.rickandmorty.personajes.domain.CharactersRepository;
import cl.malditosnakamas.rickandmorty.personajes.domain.model.Characters;
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
