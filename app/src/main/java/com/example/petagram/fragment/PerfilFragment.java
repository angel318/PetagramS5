package com.example.petagram.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.petagram.MascotaFavoritaActivity;
import com.example.petagram.R;
import com.example.petagram.adapter.MascotaAdaptador;
import com.example.petagram.adapter.PerfilMascotaAdaptador;
import com.example.petagram.pojo.Mascota;
import com.example.petagram.pojo.PerfilMascota;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    private CircularImageView circularImageView;
    private ArrayList mimascota;
    private RecyclerView listaMiMascota;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        circularImageView = (CircularImageView) getActivity().findViewById(R.id.circularImageView);

        View v = inflater.inflate(R.layout.fragment_perfil,container,false);

        listaMiMascota= (RecyclerView) v.findViewById(R.id.rvMiMascota);


        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        glm.setOrientation(GridLayoutManager.VERTICAL);
        listaMiMascota.setLayoutManager(glm);

        cargarMiMascota();
        inicializarAdaptador();
        return v;
    }


    public void inicializarAdaptador(){
        PerfilMascotaAdaptador adaptador = new PerfilMascotaAdaptador(mimascota);
        listaMiMascota.setAdapter(adaptador);
    }

    public void cargarMiMascota()
    {
        mimascota = new ArrayList<PerfilMascota>();
        mimascota.add(new PerfilMascota(R.drawable.perro4,"1"));
        mimascota.add(new PerfilMascota(R.drawable.perro4,"2"));
        mimascota.add(new PerfilMascota(R.drawable.perro4,"3"));
        mimascota.add(new PerfilMascota(R.drawable.perro4,"4"));
        mimascota.add(new PerfilMascota(R.drawable.perro4,"5"));
    }

}
