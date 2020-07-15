package cl.malditosnakamas.rickandmorty.registrousuario.presentation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.malditosnakamas.rickandmorty.databinding.FragmentRegistroUsuarioBinding;
import cl.malditosnakamas.rickandmorty.menu.MenuFragment;

public class RegistroUsuarioFragment extends Fragment {

    private FragmentRegistroUsuarioBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRegistroUsuarioBinding.inflate(inflater, container, false);
        setupButtons();
        return binding.getRoot();
    }

    private void setupButtons() {
        binding.btnRegistro.setOnClickListener((View v) -> goToMenu());
    }

    private void goToMenu() {
        if(getActivity() != null) {
            Intent intent = new Intent(getActivity(), MenuFragment.class);
            getActivity().startActivity(intent);
        }
    }
}