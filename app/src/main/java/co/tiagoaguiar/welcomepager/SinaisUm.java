package co.tiagoaguiar.welcomepager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SinaisUm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinais_um);
    }



    public void voltar(View view) {
        Intent it = new Intent(SinaisUm.this, Sinais.class);
        startActivity(it);
    }

    public void resultado(View view) {
        Intent it = new Intent(SinaisUm.this, VisiteUmMedico.class);
        startActivity(it);
    }
}