package cl.malditosnakamas.rickandmorty;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.malditosnakamas.rickandmorty.databinding.ItemCharacterBinding;
import cl.malditosnakamas.rickandmorty.model.Character;

public class CharactersAdapter extends RecyclerView.Adapter<CharacterViewHolder> {

    private List<Character> characters;
    private ItemCharacterBinding binding;

    public CharactersAdapter(List<Character> characters) {
        this.characters = characters;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_character, parent, false);
        return new CharacterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        holder.bind(characters.get(position));
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }
}
