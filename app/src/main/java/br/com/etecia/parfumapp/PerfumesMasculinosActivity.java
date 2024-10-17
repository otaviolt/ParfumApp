package br.com.etecia.parfumapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

public class PerfumesMasculinosActivity extends AppCompatActivity {
    TabLayout idTabLayoutPerfumeLacrado;
    ViewPager2 idViewPagerPerfumes;
    AdapterViewPagerPerfumes adapterViewPagerPerfumes;
    MaterialToolbar idToolBarPerfumeMasculino;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.perfumes_masculinos_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        idToolBarPerfumeMasculino = findViewById(R.id.idToolBarPerfumeMasculino);

        //clicar no botão voltar
        idToolBarPerfumeMasculino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        MenuPrincipalActivity.class));
                finish();
            }
        });

        idTabLayoutPerfumeLacrado = findViewById(R.id.idTabLayoutPerfumeLacrado);
        idViewPagerPerfumes = findViewById(R.id.idViewPagerPerfumesMasculinos);

        adapterViewPagerPerfumes = new AdapterViewPagerPerfumes(this);

        idViewPagerPerfumes.setAdapter(adapterViewPagerPerfumes);


        idTabLayoutPerfumeLacrado.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                idViewPagerPerfumes.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        idViewPagerPerfumes.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                idTabLayoutPerfumeLacrado.getTabAt(position);
            }
        });


    }
}