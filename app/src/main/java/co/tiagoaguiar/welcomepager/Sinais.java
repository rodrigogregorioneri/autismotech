package co.tiagoaguiar.welcomepager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sinais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinais);
    }

    public void sinaisUm(View view) {

        startActivity(new Intent(Sinais.this, SinaisUm.class));
    }


    public void sinaisDois(View view) {

        startActivity(new Intent(Sinais.this, SinaisDois.class));
    }

    public void sinaisTres(View view) {

        startActivity(new Intent(Sinais.this, SinaisTres.class));
    }

    public void sinaisQuatro(View view) {

        startActivity(new Intent(Sinais.this, SinaisQuatro.class));
    }

    public void voltar(View view) {
        Intent it = new Intent(Sinais.this, MenuPrincipal.class);
        it.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(it);
    }
}