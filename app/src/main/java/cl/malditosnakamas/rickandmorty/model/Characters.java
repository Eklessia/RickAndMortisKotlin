package cl.malditosnakamas.rickandmorty.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Characters {

    @SerializedName("results")
    private List<Character> characterList;

    public Characters(List<Character> characterList) {
        this.characterList = characterList;
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }
}
