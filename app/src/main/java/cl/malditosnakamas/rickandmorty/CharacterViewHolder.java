package cl.malditosnakamas.rickandmorty;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import cl.malditosnakamas.rickandmorty.model.Character;

public class CharacterViewHolder extends RecyclerView.ViewHolder {

    private ImageView ivImagen;
    private TextView tvName;
    private TextView tvOrigenName;

    public CharacterViewHolder(@NonNull View itemView) {
        super(itemView);
        ivImagen = itemView.findViewById(R.id.ivAvatar);
        tvName = itemView.findViewById(R.id.tvNombre);
        tvOrigenName = itemView.findViewById(R.id.tvOrigenName);
    }

    public void bind(Character character){
        tvName.setText(character.getName());
        tvOrigenName.setText(character.getOrigin().getName());
        Picasso.get().load(character.getImage()).into(ivImagen);
    }
}
