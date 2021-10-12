package co.tiagoaguiar.welcomepager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Entrar extends AppCompatActivity {


    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);

        botao = findViewById(R.id.button4);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Criamos uma Intent para informar a activity atual e para qual activity queremos ir
                startActivity(new Intent(Entrar.this, Cadastro.class));
            }
        });


    }
}