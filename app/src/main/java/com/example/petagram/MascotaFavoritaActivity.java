package com.example.petagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.petagram.adapter.MascotaAdaptador;
import com.example.petagram.pojo.Mascota;

import java.util.ArrayList;

public class MascotaFavoritaActivity extends AppCompatActivity {

    private RecyclerView listaMascotas;
    private ArrayList mascotas;

    public MascotaFavoritaActivity(){
        // Required empty public constructor
    }

    public MascotaFavoritaActivity(ArrayList mimascota) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascota_favorita);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBarS);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasS);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        cargarMascotas();
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void cargarMascotas()
    {
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.perro1,"Odin","2"));
        mascotas.add(new Mascota(R.drawable.perro2,"Tony Stark","4"));
        mascotas.add(new Mascota(R.drawable.perro3,"Fido","6"));
        mascotas.add(new Mascota(R.drawable.perro4,"Loki","8"));
        mascotas.add(new Mascota(R.drawable.perro5,"Firulais","10"));
    }
}
