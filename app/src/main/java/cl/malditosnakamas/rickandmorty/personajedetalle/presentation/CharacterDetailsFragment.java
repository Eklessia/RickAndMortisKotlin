package cl.malditosnakamas.rickandmorty.personajedetalle.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

import cl.malditosnakamas.rickandmorty.databinding.FragmentCharacterDetailsBinding;

public class CharacterDetailsFragment extends Fragment {

    private FragmentCharacterDetailsBinding binding;

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        super.onCreateView(inflater, parent, savedInstanceState);
        binding = FragmentCharacterDetailsBinding.inflate(inflater, parent, false);
        return binding.getRoot();
    }
}