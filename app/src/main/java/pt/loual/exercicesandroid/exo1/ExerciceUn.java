package pt.loual.exercicesandroid.exo1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pt.loual.exercicesandroid.R;
import pt.loual.exercicesandroid.outilsgeneraux.OutilsGeneraux;

public class ExerciceUn extends AppCompatActivity implements View.OnClickListener
{
    public static final String EXTRA_MESSAGE = "pt.loual.exercicesandroid.MESSAGE";

    private OutilsGeneraux outils = new OutilsGeneraux();

    private Button boutonLancer;

    private EditText chmpDe;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_un);

        boutonLancer = findViewById(R.id.boutonLancerDe);
        boutonLancer.setBackgroundResource(R.drawable.btnafpa);
        chmpDe = findViewById(R.id.chmpNbFace);

        boutonLancer.setOnClickListener(this);

        outils.changerStatusBar(ExerciceUn.this,R.color.green_800);
    }


    public void lancerDe()
    {
        if(!chmpDe.getText().toString().equals("")){
            if(chmpDe.getText().toString().matches("^[0-9]+$")){
                String nbFaces = chmpDe.getText().toString();
                Intent intent = new Intent(ExerciceUn.this,ResultatDes.class);
                intent.putExtra(EXTRA_MESSAGE,nbFaces);
                startActivity(intent);
            }
        }
    }


    @Override
    public void onClick(View view)
    {
        if(view==boutonLancer){
            lancerDe();
        }
    }
}