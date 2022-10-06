package com.example.hm_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> adress;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        adress = new ArrayList<>();
        adress.add("Шопокова");
        adress.add("Аламедин");
        adress.add("Чуй");
        adress.add("Турусбеков");
        adress.add("Манас");
        adress.add("7 апреля");
        adress.add("Молодая гвардия");
        adress.add("Киевская");
        adress.add("Московская");
        adress.add("Ахунбаев");
        adress.add("Скрябин");
        adress.add("Медерова");
        AdressAdapter adapter = new AdressAdapter(adress);
        recyclerView.setAdapter(adapter);
    }
}