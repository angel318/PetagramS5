package com.example.petagram.adapter;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.petagram.R;
import com.example.petagram.pojo.Mascota;
import com.example.petagram.pojo.PerfilMascota;

import java.util.ArrayList;

public class PerfilMascotaAdaptador extends  RecyclerView.Adapter<PerfilMascotaAdaptador.MascotaViewHolder> {

    ArrayList<PerfilMascota> perfilMascotas;

    public PerfilMascotaAdaptador(ArrayList<PerfilMascota> perfilMascotas){
        this.perfilMascotas = perfilMascotas;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_mimascota, viewGroup, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int i) {
        final PerfilMascota perfilMascota = perfilMascotas.get(i);
        mascotaViewHolder.imgFoto.setImageResource(perfilMascota.getFoto());
        mascotaViewHolder.tvRaiting.setText(perfilMascota.getRaiting());

    }

    @Override
    public int getItemCount() {//CANTIDAD DE ELEMENTOS QUE CONTIENE LA LISTA
        return perfilMascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView tvRaiting;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgImagenMM);
            tvRaiting = (TextView) itemView.findViewById(R.id.tvRankingMiMascotaCV);
        }
    }
}
