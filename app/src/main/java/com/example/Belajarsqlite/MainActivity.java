package com.example.Belajarsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cobarecyclerview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MhsModel> mhsList ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edNama = (EditText) findViewById(R.id.edNama);
        EditText edNim = (EditText) findViewById(R.id.edNim);
        EditText edNoHp = (EditText) findViewById(R.id.edNoHp);

        Button btnSimpan = (Button) findViewById(R.id.btnSimpan);

        mhsList = new ArrayList<>();

        Intent intent_List = new Intent(MainActivity.this, ListMhsActivity.class);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isian_nama = edNama.getText().toString();
                String isian_nim = edNim.getText().toString();
                String isian_noHp = edNoHp.getText().toString();

                if (isian_nama.isEmpty() || isian_nim.isEmpty() || isian_noHp.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "isian masih kosong", Toast.LENGTH_SHORT).show();
                } else {
                    mhsList.add(String.valueOf(new MhsModel(-1,isian_nama, isian_nim, isian_noHp)));

                    edNama.setText("");
                    edNim.setText("");
                    edNoHp.setText("");

                    intent_List.putParcelableArrayListExtra("mhsList",mhsList);
                    startActivity(intent_List);
                }
            }
        });

        Button btnLihat = (Button) findViewById(R.id.btnLihat);
        btnLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mhsList.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Belum ada data", Toast.LENGTH_SHORT).show();
                } else {
                    intent_List.putParcelableArrayListExtra("mhsList", mhsList);
                    startActivity(intent_List);
                }
            }
        });
    }
    }
