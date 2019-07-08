package com.example.petagram.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.petagram.R;
import com.example.petagram.adapter.MascotaAdaptador;
import com.example.petagram.pojo.Mascota;

import java.util.ArrayList;

public class RecyclerviewFragment extends Fragment {
    private ArrayList mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview,container,false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        cargarMascotas();
        inicializarAdaptador();
        return v;
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
