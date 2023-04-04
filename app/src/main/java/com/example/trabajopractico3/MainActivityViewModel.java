package com.example.trabajopractico3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.trabajopractico3.Models.Pelicula;

import java.util.ArrayList;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Pelicula>> lista;
    private ArrayList<Pelicula> peliculas ;

    public MainActivityViewModel() {
        peliculas = new ArrayList<>();
    }

    public LiveData<ArrayList<Pelicula>> getLista() {
        if(this.lista == null){
            this.lista = new MutableLiveData<>();
        }
        return this.lista;
    }

    public void llenarLista(){
        peliculas.add(new Pelicula("El señor de los anillos", R.drawable.anillos, "bla bla bla", "J.J. Abrams", "Joss Whedon"));
        peliculas.add(new Pelicula("Star Wars", R.drawable.starwars, "bla bla bla", "J.J. Abrams", "Joss Whedon"));
        peliculas.add(new Pelicula("Transformers", R.drawable.transformers, "bla bla bla", "J.J. Abrams", "Joss Whedon"));
        lista.setValue(peliculas);
    }
}
