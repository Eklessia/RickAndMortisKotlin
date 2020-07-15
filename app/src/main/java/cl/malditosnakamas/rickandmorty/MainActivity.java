package cl.malditosnakamas.rickandmorty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cl.malditosnakamas.rickandmorty.databinding.ActivityMainBinding;
import cl.malditosnakamas.rickandmorty.menu.MenuFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupClickListener();
    }

    private void setupClickListener() {
        //Callbacks - Listener
        binding.brnEntrar.setOnClickListener((View v) -> goToMenu());
        binding.brnEntrar.setOnClickListener((View v) -> goToMenu());
        binding.brnEntrar.setOnClickListener((View v) -> goToMenu());
        binding.brnEntrar.setOnClickListener((View v) -> goToMenu());
        binding.brnEntrar.setOnClickListener((View v) -> goToMenu());
    }

    private void goToMenu() {
        Intent intent = new Intent(this, MenuFragment.class);
        startActivity(intent);
    }
}