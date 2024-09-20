package br.com.etecia.parfumapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {

    CardView PerfumesMasculinos, PerfumesFemininos, Hidratantes, BodySplash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.menu_principal_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        PerfumesMasculinos = findViewById(R.id.masculino);
        PerfumesFemininos = findViewById(R.id.feminino);
        Hidratantes = findViewById(R.id.hidratante);
        BodySplash = findViewById(R.id.bodysplash);

        PerfumesMasculinos.setOnClickListener(this);
        PerfumesFemininos.setOnClickListener(this);
        Hidratantes.setOnClickListener(this);
        BodySplash.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.masculino) {
            startActivity(new Intent(getApplicationContext(), PerfumesMasculinosActivity.class));
        }
        if (view.getId() == R.id.feminino) {
            startActivity(new Intent(getApplicationContext(), PerfumesFemininosActivity.class));
        }
        if (view.getId() == R.id.hidratante) {
            startActivity(new Intent(getApplicationContext(), HidratantesActivity.class));
        }
        if (view.getId() == R.id.bodysplash) {
            startActivity(new Intent(getApplicationContext(), BodySplashActivity.class));
        }

    }
}