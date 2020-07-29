package cl.malditosnakamas.rickandmorty.personajes.presentation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.analytics.FirebaseAnalytics;

import org.jetbrains.annotations.NotNull;

import cl.malditosnakamas.rickandmorty.databinding.FragmentCharacterListBinding;
import cl.malditosnakamas.rickandmorty.network.api.RetrofitHandler;
import cl.malditosnakamas.rickandmorty.personajes.data.remote.RemoteCharactersRepository;
import cl.malditosnakamas.rickandmorty.personajes.domain.CharactersRepository;
import cl.malditosnakamas.rickandmorty.personajes.domain.model.Character;
import cl.malditosnakamas.rickandmorty.personajes.domain.model.Characters;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class CharactersListFragment extends Fragment implements OnItemClickListener {

    private CharactersRepository charactersRepository;
    private FragmentCharacterListBinding binding;
    private RecyclerView.LayoutManager layoutManager;
    private CharactersAdapter charactersAdapter;

    private DialogFragment dialog;




    /*@SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentCharacterListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String param1 = getIntent().getStringExtra(MenuActivity.PARAM_1);
        int param2 = getIntent().getIntExtra(MenuActivity.PARAM_2, 0);
        boolean param3 = getIntent().getBooleanExtra(MenuActivity.PARAM_3, false);

        alerta("Parametro 1 = " + param1 + ", Param 2 = " + param2 + ", Param 3 = " + param3);

        layoutManager = new LinearLayoutManager(this);
        binding.rvListadoDePersonajes.setHasFixedSize(true);
        binding.rvListadoDePersonajes.setLayoutManager(layoutManager);


        charactersRepository = new RemoteCharactersRepository(RetrofitHandler.getCharacterApi());
        charactersRepository.getAll()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResults, this::handleError);

    }*/

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCharacterListBinding.inflate(inflater, container, false);
        setupRecyclerView();
        setupRepository();
        return binding.getRoot();
    }

    private void setupRecyclerView() {
        layoutManager = new LinearLayoutManager(getActivity());
        binding.rvListadoDePersonajes.setHasFixedSize(true);
        binding.rvListadoDePersonajes.setLayoutManager(layoutManager);
    }

    @SuppressLint("CheckResult")
    private void setupRepository() {
        charactersRepository = new RemoteCharactersRepository(RetrofitHandler.getCharacterApi());
        charactersRepository.getAll()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResults, this::handleError);
    }

    private void handleError(Throwable throwable) {
        alerta("Ocurrio un error " + throwable.getMessage());
    }

    private void handleResults(Characters characters) {
        charactersAdapter = new CharactersAdapter(characters.getCharacterList(), this);
        binding.rvListadoDePersonajes.setAdapter(charactersAdapter);
    }

    @Override
    public void onItemClickCharacter(Character character) {
        alerta("Click en Item " + character.getId());
    }

    private void alerta(String mensaje) {
        Toast.makeText(getContext(), mensaje, Toast.LENGTH_LONG).show();
    }
}