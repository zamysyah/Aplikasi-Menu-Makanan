package com.almas27.aplikasimenumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KulinerAdapter extends RecyclerView.Adapter<KulinerAdapter.ViewHolder> {
    public ArrayList<Kuliner> listMakanan;

    public KulinerAdapter(ArrayList<Kuliner> listMakanan) {
        this.listMakanan = listMakanan;
    }

    @NonNull
    @Override
    public KulinerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // memasukan layout ke view holder
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_kuliner, parent, false));


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull KulinerAdapter.ViewHolder holder, int position) {
        // mapping komponen
        Kuliner kuliner = listMakanan.get(position);
        holder.txtNama.setText(kuliner.getNama());
        holder.txtHarga.setText(kuliner.getHarga());
        holder.imgFoto.setImageResource(kuliner.getImgFoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(v.getContext(), Detail_Makanan.class);

                it.putExtra("nama", kuliner.getNama());
                it.putExtra("harga", kuliner.getHarga());
                it.putExtra("deskripsi", kuliner.getDeskripsi());
                it.putExtra("foto", kuliner.getImgFoto());

                v.getContext().startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtNama, txtHarga;
        public ImageView imgFoto;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = itemView.findViewById(R.id.txtNama);
            txtHarga = itemView.findViewById(R.id.txtHarga);
            imgFoto = itemView.findViewById(R.id.imgFoto);

            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.main_layout);
        }
    }
}
