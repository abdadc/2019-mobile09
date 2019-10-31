package com.example.recyclerviewgambartextplusscroll;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewgambartextplusscroll.adapters.SuperHeroAdapter;
import com.example.recyclerviewgambartextplusscroll.models.SuperHero;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSuperHero;
    List<SuperHero> listSuperHero = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSuperHero = findViewById(R.id.rvSuperHero);

        listSuperHero.add(new SuperHero(
                "Petruk",
                "Petruk adalah tokoh punakawan dalam pewayangan Jawa, di pihak keturunan/trah Witaradya. Petruk tidak disebutkan dalam kitab Mahabarata dari India. Keberadaan tokoh ini dalam dunia pewayangan merupakan gubahan asli masyarakat Jawa.",
                R.drawable.petruk));
        listSuperHero.add(new SuperHero(
                "Gareng",
                "Gareng adalah salah satu dari empat punakawan yang sering muncul dalam pertunjukan wayang di Jawa. Nama lengkapnya adalah Nala Gareng, hanya saja lebih akrab dengan sebutan “Gareng”.",
                R.drawable.gareng));
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this ,LinearLayoutManager.HORIZONTAL, false));

    }
}
