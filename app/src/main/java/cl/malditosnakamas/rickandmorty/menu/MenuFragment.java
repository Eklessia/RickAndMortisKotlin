package cl.malditosnakamas.rickandmorty.menu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.google.firebase.analytics.FirebaseAnalytics;

import org.jetbrains.annotations.NotNull;

import cl.malditosnakamas.rickandmorty.R;
import cl.malditosnakamas.rickandmorty.databinding.FragmentMenuBinding;


public class MenuFragment extends Fragment {

    private FragmentMenuBinding binding;
    private FirebaseAnalytics firebaseAnalytics;


    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        super.onCreateView(inflater, parent, savedInstanceState);

        firebaseAnalytics = FirebaseAnalytics.getInstance(getContext());


        binding = FragmentMenuBinding.inflate(inflater, parent, false);

        binding.btnIrAGoogle.setOnClickListener((View v) -> goToGoogle());
        binding.btnCompartirTexto.setOnClickListener((View v) -> goToCompartirTexto());
        binding.btnIrAListado.setOnClickListener((View v) -> goToIrAListado(v));
        binding.btnIrAConfiguracion.setOnClickListener((View v) -> goToConfiguracion(v));
        return binding.getRoot();
    }

    private void goToConfiguracion(View v) {
        Navigation.findNavController(v).navigate(R.id.action_menuFragment_to_configurationFragment);
    }

    private void goToIrAListado(View v) {
        Navigation.findNavController(v).navigate(R.id.action_menuFragment_to_charactersListFragment);
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
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "1");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Harttyn");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
        //throw new RuntimeException("Esto es un error para la tribuna");
        /*
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(browserIntent);*/
    }
}