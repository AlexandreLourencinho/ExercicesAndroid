package pt.loual.exercicesandroid.exo1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import pt.loual.exercicesandroid.R;
import pt.loual.exercicesandroid.exo1.outils.OutilsExoUn;
import pt.loual.exercicesandroid.outilsgeneraux.OutilsGeneraux;

public class ResultatDes extends AppCompatActivity implements View.OnClickListener
{
    private Button boutonRelancer;
    private TextView resultatDe;
    private OutilsGeneraux outils = new OutilsGeneraux();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat_des);


        boutonRelancer =findViewById(R.id.boutonRelancer);
        resultatDe = findViewById(R.id.resultatDe);


        boutonRelancer.setBackgroundResource(R.drawable.btnafpa);


        boutonRelancer.setOnClickListener(ResultatDes.this);

        if(getIntent()!=null){
            Intent intent = getIntent();
            int nbface = Integer.parseInt(intent.getStringExtra(ExerciceUn.EXTRA_MESSAGE));
            OutilsExoUn outils = new OutilsExoUn();
            int resultat = outils.randomDe(nbface);
            System.out.println(resultat);
            resultatDe.setText(String.valueOf(resultat));
        }

        outils.changerStatusBar(ResultatDes.this,R.color.green_800);

    }


    @Override
    public void onClick(View view)
    {
        if (view == boutonRelancer) {
            fonctionDe();
        }
    }

    public void fonctionDe()
    {
        AlertDialog.Builder alerte = new AlertDialog.Builder(ResultatDes.this);
        EditText chmpNouveauDe = new EditText(this);
        alerte.setTitle(R.string.titreNouveauDe)
                .setMessage(R.string.messageNouveauDe)
                .setView(chmpNouveauDe)
                .setPositiveButton(R.string.lancer, ((dialogInterface, i) ->
                {
                    if (!chmpNouveauDe.getText().toString().equals("")) {
                        if (chmpNouveauDe.getText().toString().matches("^[0-9]+$")) {
                            dialogInterface.dismiss();
                            OutilsExoUn outils = new OutilsExoUn();
                            int result = outils.randomDe(Integer.parseInt(chmpNouveauDe.getText().toString()));
                            resultatDe.setText(String.valueOf(result));
                        } else {
                            dialogInterface.dismiss();
                            AlertDialog.Builder alarme = new AlertDialog.Builder(this);
                            alarme.setTitle(R.string.titreEnguaulade)
                                    .setMessage(R.string.messageEngueulade)
                                    .setCancelable(false)
                                    .setNeutralButton(R.string.ok, ((dialogInterface1, i1) -> fonctionDe()))
                                    .show();
                        }
                    } else {
                        AlertDialog.Builder alarme = new AlertDialog.Builder(this);
                        alarme.setTitle(R.string.titreDeVide)
                                .setMessage(R.string.messageDeVide)
                                .setCancelable(false)
                                .setNeutralButton(R.string.ok, ((dialogInterface1, i1) -> fonctionDe()))
                                .show();
                    }
                })).setNegativeButton(R.string.annuler, (dialogInterface, i) ->
                dialogInterface.dismiss()
        )
                .setCancelable(false)
                .show();

    }


}