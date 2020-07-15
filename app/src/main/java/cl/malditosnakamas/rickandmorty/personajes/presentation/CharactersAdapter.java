package cl.malditosnakamas.rickandmorty.personajes.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.malditosnakamas.rickandmorty.R;
import cl.malditosnakamas.rickandmorty.personajes.domain.model.Character;

public class CharactersAdapter extends RecyclerView.Adapter<CharacterViewHolder> {

    private List<Character> characters;
    private OnItemClickListener listener;

    public CharactersAdapter(List<Character> characters) {
        this.characters = characters;
    }

    public CharactersAdapter(List<Character> characters, OnItemClickListener listener) {
        this.characters = characters;
        this.listener = listener;
    }

    public OnItemClickListener getListener() {
        return listener;
    }

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_character, parent, false);
        return new CharacterViewHolder(view, listener);
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
