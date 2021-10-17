package co.tiagoaguiar.welcomepager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class VisiteUmMedico extends AppCompatActivity {

    private ImageView gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visite_um_medico);

        gif = (ImageView)findViewById(R.id.gif);


        Glide.with(this)
                .load(R.drawable.medico) // aqui é teu gif
                .asGif()
                .into(gif);



    }

    public void menu(View view) {

        startActivity(new Intent(VisiteUmMedico.this, MenuPrincipal.class));
    }
}