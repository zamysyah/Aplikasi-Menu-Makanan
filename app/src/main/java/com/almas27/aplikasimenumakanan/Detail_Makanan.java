package com.almas27.aplikasimenumakanan;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detail_Makanan extends AppCompatActivity {

    ImageView img_gambarM;
    TextView txt_namaM, txt_hargaM, txt_descM;

    String namaMakanan, deskripsi, harga;
    int foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        txt_namaM = findViewById(R.id.txt_namaM);
        txt_descM = findViewById(R.id.txt_descM);
        txt_hargaM = findViewById(R.id.txt_hargaM);
        img_gambarM = findViewById(R.id.img_gambarM);

        // foto makanan
        Bundle bundle =  getIntent().getExtras();
        foto = bundle.getInt(String.valueOf("foto"));
        img_gambarM.setImageResource(foto);

        getInputExtra();
    }

    private void getInputExtra() {

        namaMakanan = getIntent().getStringExtra("nama");
        deskripsi = getIntent().getStringExtra("deskripsi");
        harga = getIntent().getStringExtra("harga");

        setDataActivity(namaMakanan, deskripsi, harga);
    }

    private void setDataActivity(String namaMakanan, String deskripsi, String harga){
        txt_namaM.setText(namaMakanan);
        txt_descM.setText(deskripsi);
        txt_hargaM.setText(harga);

    }

}