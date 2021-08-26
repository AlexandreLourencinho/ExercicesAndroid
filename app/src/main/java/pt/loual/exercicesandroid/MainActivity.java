package pt.loual.exercicesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pt.loual.exercicesandroid.exempleimg.ExempleImg;
import pt.loual.exercicesandroid.exemplelistview.gui.ExempleListView;
import pt.loual.exercicesandroid.exo1.ExerciceUn;
import pt.loual.exercicesandroid.exo2.ExerciceDeux;
import pt.loual.exercicesandroid.outilsgeneraux.OutilsGeneraux;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button boutonExoUn;
    private Button boutonExoDeux;
    private OutilsGeneraux outils = new OutilsGeneraux();
    private Button boutonExempleImg;
    private Button boutonListView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-------------------------------------------------------------------------------------||
        // ------------------------------Récupération des vues---------------------------------||
        //-------------------------------------------------------------------------------------||
        boutonExoUn = findViewById(R.id.boutonExoUn);
        boutonExoDeux = findViewById(R.id.boutonExoDeux);
        boutonExempleImg = findViewById(R.id.boutonExempleImage);
        boutonListView = findViewById(R.id.boutonListView);
        //*************************************************************************************||


        //-------------------------------------------------------------------------------------||
        //-------------------------Déclaration des onclicklistener-----------------------------||
        //-------------------------------------------------------------------------------------||
        boutonExoUn.setOnClickListener(MainActivity.this);
        boutonExoDeux.setOnClickListener(MainActivity.this);
        boutonExempleImg.setOnClickListener(MainActivity.this);
        boutonListView.setOnClickListener(MainActivity.this);
        //**************************************************************************************||
        //**************************************************************************************||

        outils.changerStatusBar(MainActivity.this,R.color.green_800);
    }


    /**
     *
     */
    public void redirectionExoUn()
    {
            outils.lancementIntent(MainActivity.this,ExerciceUn.class);
    }

    /**
     *
     */
    public void redirectionExoDeux()
    {
        outils.lancementIntent(MainActivity.this,ExerciceDeux.class);
    }

    /**
     *
     */
    public void redirectionExempleImage()
    {
        outils.lancementIntent(MainActivity.this, ExempleImg.class);

    }

    /**
     *
     */
    public void redirectionExempleListView()
    {
        outils.lancementIntent(MainActivity.this, ExempleListView.class);
    }

    /**
     *
     * @param vue
     */
    @Override
    public void onClick(View vue)
    {
        switch(vue.getId())
        {
            case (R.id.boutonExoUn) :
                redirectionExoUn();
                break;
            case (R.id.boutonExoDeux) :
                redirectionExoDeux();
                break;
            case(R.id.boutonExempleImage):
                redirectionExempleImage();
                break;
            case(R.id.boutonListView):
                redirectionExempleListView();
                break;
            default :
                OutilsGeneraux outs = new OutilsGeneraux();
                outs.alertesNeutres(MainActivity.this,R.string.ok,R.string.ok,R.string.ok);
        }
    }
}