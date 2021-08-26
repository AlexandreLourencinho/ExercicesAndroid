package pt.loual.exercicesandroid.exo2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.Objects;

import pt.loual.exercicesandroid.R;
import pt.loual.exercicesandroid.exo1.ExerciceUn;
import pt.loual.exercicesandroid.outilsgeneraux.OutilsGeneraux;

public class ExerciceDeux extends AppCompatActivity
{
    OutilsGeneraux outils = new OutilsGeneraux();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_deux);

        ActionBar actionbar = getSupportActionBar();
        ColorDrawable couleur = new ColorDrawable(Color.parseColor("#3949AB"));
        Objects.requireNonNull(actionbar).setBackgroundDrawable(couleur);

        outils.changerStatusBar(ExerciceDeux.this,R.color.blue_900);
    }
}