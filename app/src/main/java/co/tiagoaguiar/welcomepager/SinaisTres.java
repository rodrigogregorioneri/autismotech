package co.tiagoaguiar.welcomepager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SinaisTres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinais_tres);
    }

    public void voltar(View view) {
        Intent it = new Intent(SinaisTres.this, Sinais.class);
        it.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(it);
    }


    public void resultado(View view) {
        Intent it = new Intent(SinaisTres.this, VisiteUmMedico.class);
        startActivity(it);
    }
}