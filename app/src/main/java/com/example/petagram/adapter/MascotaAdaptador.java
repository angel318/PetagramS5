package com.example.petagram.adapter;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.petagram.pojo.Mascota;
import com.example.petagram.R;

import java.util.ArrayList;

public class MascotaAdaptador extends  RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;

    public MascotaAdaptador(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_mascota, viewGroup, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int i) {
        final Mascota mascota = mascotas.get(i);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombreCV.setText(mascota.getNombre());
        mascotaViewHolder.tvRaiting.setText(mascota.getRaiting());

        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Like a "+mascota.getNombre(),Snackbar.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {//CANTIDAD DE ELEMENTOS QUE CONTIENE LA LISTA
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView tvNombreCV;
        private TextView tvRaiting;
        private ImageButton btnLike;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgImagen);
            tvNombreCV = (TextView) itemView.findViewById(R.id.tvNombreMascotaCV);
            tvRaiting = (TextView) itemView.findViewById(R.id.tvRankingMascCV);
            btnLike = (ImageButton) itemView.findViewById(R.id.btnBoneLikeCV);
        }
    }
}
