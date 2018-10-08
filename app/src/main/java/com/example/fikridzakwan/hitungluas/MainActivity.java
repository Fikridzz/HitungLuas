package com.example.fikridzakwan.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Membuat varialbe Global
    TextView txtJdl;
    Button btnStart;
    EditText edtText;
    EditText edtPanjang;
    EditText edtLebar;
    TextView txtHasil;

    // Membuat variable global untuk menghitung luas
    Integer panjang,lebar,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inisilasi widget ke dalam variable java agar dapat digunakan
        txtJdl = findViewById(R.id.txtJudul);
        edtText = findViewById(R.id.edtText);
        btnStart = findViewById(R.id.btnStart);

        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar   = findViewById(R.id.edtLebar);
        txtHasil = findViewById(R.id.txtHasil);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung();

            }
        });
    }

    public void  hitung() {
        String isiEditText = edtText.getText().toString();

        // Memasukan input panjang dan lebar dari user ke dalam variable
        panjang = Integer.valueOf(edtPanjang.getText().toString());
        lebar = Integer.valueOf(edtLebar.getText().toString());

        // Menghitung luas persegi panjang = P * L
        hasil = panjang * lebar;

        // Cetak hasil
        txtHasil.setText("Hello " + isiEditText + " Hasil luas nya adalah : " + hasil);

    }
}
