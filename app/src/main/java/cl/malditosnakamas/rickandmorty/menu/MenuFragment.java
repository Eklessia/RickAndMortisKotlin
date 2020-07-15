package cl.malditosnakamas.rickandmorty.menu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

import cl.malditosnakamas.rickandmorty.databinding.FragmentMenuBinding;


public class MenuFragment extends Fragment {

    private FragmentMenuBinding binding;


    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        super.onCreateView(inflater, parent, savedInstanceState);
        binding = FragmentMenuBinding.inflate(inflater, parent, false);

        binding.btnIrAGoogle.setOnClickListener((View v) -> goToGoogle());
        binding.btnCompartirTexto.setOnClickListener((View v) -> goToCompartirTexto());
        binding.btnIrAListado.setOnClickListener((View v) -> goToIrAListado());
        return binding.getRoot();
    }

    private void goToIrAListado() {

    }

    private void goToCompartirTexto() {
        Intent intentImplicito = new Intent(android.content.Intent.ACTION_SEND);
        intentImplicito.setType("text/plain");
        intentImplicito.putExtra(android.content.Intent.EXTRA_SUBJECT, "subject");
        intentImplicito.putExtra(android.content.Intent.EXTRA_TEXT, "texto");
        intentImplicito.putExtra(Intent.EXTRA_TITLE, "title");
        startActivity(Intent.createChooser(intentImplicito, "Texto en el dialogo"));
    }

    private void goToGoogle() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(browserIntent);
    }
}