package co.tiagoaguiar.welcomepager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void sinais(View view) {

        startActivity(new Intent(MenuPrincipal.this, Sinais.class));
    }

    public void ongs(View view) {

        startActivity(new Intent(MenuPrincipal.this, Ongs.class));
    }
}