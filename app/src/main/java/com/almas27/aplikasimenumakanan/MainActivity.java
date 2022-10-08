package com.almas27.aplikasimenumakanan;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec_Makanan;
    private ArrayList <Kuliner> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        // memanggil class KulinerAdapter agar menu muncul
        rec_Makanan.setAdapter(new KulinerAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Kuliner("Corn Dog",
                "Rp. 10.000",
                "Corn Dog adalah makanan yang terbuat dari daging sapi yang digoreng dan dibungkus dengan tepung roti yang digoreng kering. Corn Dog biasanya disajikan dengan saus ketchup dan saus mayonaise.",
                R.drawable.corndog));
        listMakanan.add(new Kuliner("Mendoan",
                "Rp. 5.000",
                "Mendoan adalah makanan khas Indonesia yang terbuat dari tempe yang dibalu-balut dengan tepung beras dan digoreng. Mendoan biasanya disajikan dengan kecap manis dan cabai hijau.",
                R.drawable.mendoan));
        listMakanan.add(new Kuliner("Mie Goreng",
                "Rp. 15.000",
                "Mie Goreng adalah makanan khas Indonesia yang terbuat dari mie yang digoreng dan ditambah dengan berbagai macam bumbu. Mie Goreng biasanya disajikan dengan telur, ayam, dan sayuran.",
                R.drawable.miegoreng));
        listMakanan.add(new Kuliner("Sate",
                "Rp. 20.000",
                "Sate adalah makanan khas Indonesia yang terbuat dari daging seperti daging ayam, atau kambing dan dibumbui dengan bumbu kacang. Sate biasanya disajikan dengan sambal kacang dan lontong.",
                R.drawable.sate));
        listMakanan.add(new Kuliner("Soto",
                "Rp. 15.000",
                "Soto adalah makanan khas Indonesia yang terbuat dari berbagai macam sayuran dan daging sapi yang dibumbui dengan bumbu kacang. Soto biasanya disajikan dengan nasi atau lontong dan telur.",
                R.drawable.soto));
        listMakanan.add(new Kuliner("Spaghetti",
                "Rp. 25.000",
                "Spaghetti adalah makanan khas Italia yang terbuat dari tepung terigu yang dibentuk menjadi pasta dan ditambah dengan berbagai macam bumbu. Spaghetti biasanya disajikan dengan keju parmesan dan daging sapi.",
                R.drawable.spaghetti));
    }


}