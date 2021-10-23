package com.aji.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recMakanan;
    private ArrayList<makanan> listMakanan;
    private ArrayList<String> namamakanan = new ArrayList<>();
    private ArrayList<String> hargamakanan = new ArrayList<>();
    private ArrayList<String> fotomakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.rec_makanan);
        iniData();

        recMakanan.setAdapter(new makananAdapter(listMakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));

    }
    private void iniData(){
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new makanan("Bebek Goreng","Bebek Goreng khas bandung","Rp.20.000",
                R.drawable.bebe));

        listMakanan.add(new makanan("Nasi Goreng",
                "Nasi goreng Jawa dengan aneka toping", "Rp 12.000",
                R.drawable.nasigoreng));

        listMakanan.add(new makanan("Rawon",
                "Rawon khas daerah Jawa Tengah", "Rp 10.000" ,
                R.drawable.rawon));

        listMakanan.add(new makanan("Tahu Bulat",
                "Tahu bulat dengan isian keju manis", "Rp 5.000" ,
                R.drawable.tahubulat));

        listMakanan.add(new makanan("Ayam Geprek Keju",
                "Ayam Geprek Keju dengan toping keju Mozzarella", "Rp 20.000" ,
                R.drawable.ayamgeprekkeju));

        listMakanan.add(new makanan("Pecel Lele",
                "Pecel Lele dengan lalapan ", "Rp 12.000" ,
                R.drawable.pecellele));




    }
}