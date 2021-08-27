package pt.loual.exercicesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import pt.loual.exercicesandroid.numerologie.gui.Numerology;
import pt.loual.exercicesandroid.outilsgeneraux.OutilsGeneraux;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener
{

    private ImageButton boutonRetour;
    private Button boutonNumerologie;
    private OutilsGeneraux outils = new OutilsGeneraux();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        boutonRetour = findViewById(R.id.boutonRetourPage1);
        boutonNumerologie = findViewById(R.id.boutonNumerology);


        boutonRetour.setOnClickListener(this);
        boutonNumerologie.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()){
            case (R.id.boutonRetourPage1) :
                finish();
                break;
            case(R.id.boutonNumerology):
                redirectionExoNumero();
                break;
        }
    }

    public void redirectionExoNumero()
    {
        outils.lancementIntent(MainActivity2.this, Numerology.class);
    }


}