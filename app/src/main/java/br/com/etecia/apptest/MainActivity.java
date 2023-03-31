package br.com.etecia.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {
    //Declrando uma variável global que irá representar o xml no Java
    MaterialToolbar idToolBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentando o xml para o java
        idToolBar = findViewById(R.id.idToolBar);

        //Criando click no menu de navegação
        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cliquei no menu hamburguer", Toast.LENGTH_SHORT).show();
            }
        });

        //Criando clique nos itens de menu

        idToolBar.setOnMenuItemClickListener(new);


    }
}