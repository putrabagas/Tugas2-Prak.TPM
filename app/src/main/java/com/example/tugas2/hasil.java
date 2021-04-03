package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class hasil extends AppCompatActivity {

    public TextView tvNama, tvNIM, tvNilai;
    Intent  i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        tvNama = findViewById(R.id.tv_Nama);
        tvNIM = findViewById(R.id.tv_NIM);
        tvNilai = findViewById(R.id.tv_Nilai);

    }

    @Override
    protected void onStart() {
        super.onStart();
        i = getIntent();

        tvNama.setText(i.getStringExtra("NAMA"));
        tvNIM.setText(i.getStringExtra("NIM"));

        String sNilai = i.getStringExtra("NILAI");

        double nilai = Double.parseDouble(sNilai);

        if (3.66 < nilai && nilai <= 4.00) {
            sNilai = "A";
        } else if (3.33 < nilai && nilai <= 3.66) {
            sNilai = "A-";
        } else if (3.00 < nilai && nilai <= 3.33) {
            sNilai = "B+";
        } else if (2.66 < nilai && nilai <= 3.00) {
            sNilai = "B";
        } else if (2.33 < nilai && nilai <= 2.66) {
            sNilai = "B-";
        } else if (2.00 < nilai && nilai <= 2.33) {
            sNilai = "C+";
        } else if (1.66 < nilai && nilai <= 2.00) {
            sNilai = "C";
        } else if (1.33 < nilai && nilai <= 1.66) {
            sNilai = "C-";
        } else if (1.00 < nilai && nilai <= 1.33) {
            sNilai = "D+";
        } else if (nilai <= 1.00) {
            sNilai = "D";
        } else {
            sNilai = "Eror";
        }

        tvNilai.setText(sNilai);

    }
}