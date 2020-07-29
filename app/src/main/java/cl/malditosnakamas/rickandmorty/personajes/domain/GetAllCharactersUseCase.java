package cl.malditosnakamas.rickandmorty.personajes.domain;

import cl.malditosnakamas.rickandmorty.personajes.domain.model.Characters;
import io.reactivex.Single;

public class GetAllCharactersUseCase {

    private CharactersRepository repository;

    public GetAllCharactersUseCase(CharactersRepository repository) {
        this.repository = repository;
    }

    public Single<Characters> getAllCharacters(){
        return repository.getAll();
    }
}
