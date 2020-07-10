package cl.malditosnakamas.rickandmorty.data;

import java.util.ArrayList;
import java.util.List;

import cl.malditosnakamas.rickandmorty.model.Character;
import cl.malditosnakamas.rickandmorty.model.Characters;
import cl.malditosnakamas.rickandmorty.model.Origin;
import io.reactivex.Single;

public class FakeCharactersRepository implements CharactersRepository {

    @Override
    public Single<Characters> getAll() {
        return Single.just(new Characters(getFakeCharacters()));
    }

    private List<Character> getFakeCharacters() {
        ArrayList<Character> characters = new ArrayList<>();
        for (int x = 1; x < 100; x++) {
            characters.add(getFakeCharacter(x));
        }
        return characters;
    }

    private Character getFakeCharacter(Integer id) {
        return new Character(id, "Character " + id, obtainUrlFake(id), new Origin("",""));
    }

    private String obtainUrlFake(Integer id) {
        return "https://rickandmortyapi.com/api/character/avatar/" + id + ".jpeg";
    }
}
