package br.com.etecia.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {
// Declarando variavel global do tipo xml
Button btnAbrirLogin,btnAbrirMenu;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.splash_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnAbrirLogin = findViewById(R.id.btnSplash);

       //criar uma ação para o componente button
        btnAbrirLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Instanciando o intent com o texto e a janela será aberta
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                // Abrir outra janela com o metodo startActivity
                startActivity(intent);
                //Fechando janela atual
                finish();
            }
            });
        //função ir para menu principal
        btnAbrirMenu = findViewById(R.id.btnMenuz);

        btnAbrirMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MenuPrincipalActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }
}