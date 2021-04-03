package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button btnSubmit;
    public EditText etNama,etNIM,etNilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.et_Nama);
        etNIM = findViewById(R.id.et_NIM);
        etNilai = findViewById(R.id.et_Nilai);
        btnSubmit = findViewById(R.id.btn_Submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent Link = new Intent(MainActivity.this, hasil.class);

                    Link.putExtra("NAMA", etNama.getText().toString());
                    Link.putExtra("NIM", etNIM.getText().toString());
                    Link.putExtra("NILAI", etNilai.getText().toString());

                startActivity(Link);
            }
        });
    }
}