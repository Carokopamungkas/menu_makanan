package com.aji.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class makananAdapter extends RecyclerView.Adapter<makananAdapter.ViewHolder> {
    private Context context;

    public makananAdapter(ArrayList<makanan> listMakanan) {
        this.listMakanan = listMakanan;
    }
    private ArrayList<com.aji.myapplication.makanan> listMakanan;


    @NonNull
    @Override
    public makananAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater =LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_makanan, parent, false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull makananAdapter.ViewHolder holder, int position) {

        makanan Makanan = listMakanan.get(position);
        holder.txtNama.setText(Makanan.getNama());
        holder.txtHarga.setText(Makanan.getHarga());
        holder.imgFoto.setImageResource(Makanan.getId_gambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Toast.makeText(holder.itemView.getContext(), Makanan.getDiskripsi(), Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtNama, txtHarga;
        public ImageView imgFoto;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txtNama);
            txtHarga = (TextView) itemView.findViewById(R.id.txtHarga);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.mainLayout);

        }
    }
}
