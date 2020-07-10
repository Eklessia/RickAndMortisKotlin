package cl.malditosnakamas.rickandmorty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import cl.malditosnakamas.rickandmorty.data.CharactersRepository;
import cl.malditosnakamas.rickandmorty.data.FakeCharactersRepository;
import cl.malditosnakamas.rickandmorty.data.RemoteCharactersRepository;
import cl.malditosnakamas.rickandmorty.data.api.RetrofitHandler;
import cl.malditosnakamas.rickandmorty.databinding.ActivityMainBinding;
import cl.malditosnakamas.rickandmorty.model.Characters;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private CharactersRepository charactersRepository;

    private ActivityMainBinding binding;
    private RecyclerView.LayoutManager layoutManager;
    private CharactersAdapter charactersAdapter;

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        layoutManager = new LinearLayoutManager(this);
        binding.rvListadoDePersonajes.setHasFixedSize(true);
        binding.rvListadoDePersonajes.setLayoutManager(layoutManager);



        charactersRepository = new RemoteCharactersRepository(RetrofitHandler.getCharacterApi());
        charactersRepository.getAll()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResults, this::handleError);

    }

    private void handleError(Throwable throwable) {
        Toast.makeText(this, "Ocurrio un error " + throwable.getMessage(), Toast.LENGTH_LONG).show();
    }

    private void handleResults(Characters characters) {
        charactersAdapter = new CharactersAdapter(characters.getCharacterList());
        binding.rvListadoDePersonajes.setAdapter(charactersAdapter);
    }
}