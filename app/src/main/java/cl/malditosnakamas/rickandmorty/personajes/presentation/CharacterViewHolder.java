package cl.malditosnakamas.rickandmorty.personajes.presentation;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import cl.malditosnakamas.rickandmorty.databinding.ItemCharacterBinding;
import cl.malditosnakamas.rickandmorty.personajes.domain.model.Character;

public class CharacterViewHolder extends RecyclerView.ViewHolder {

    private ItemCharacterBinding binding;
    private OnItemClickListener onItemClickListener;

    public CharacterViewHolder(@NonNull View itemView, OnItemClickListener listener) {
        super(itemView);
        this.onItemClickListener = listener;
        binding = ItemCharacterBinding.bind(itemView);
    }

    public void bind(Character character) {
        binding.tvNombre.setText(character.getName());
        binding.tvOrigenName.setText(character.getOrigin().getName());
        Picasso.get().load(character.getImage()).into(binding.ivAvatar);
        binding.getRoot().setOnClickListener((View v) -> goToDetailsCharacter(character));
    }

    private void goToDetailsCharacter(Character character) {
        if (onItemClickListener != null) {
            onItemClickListener.onItemClickCharacter(character);
        }
    }
}
