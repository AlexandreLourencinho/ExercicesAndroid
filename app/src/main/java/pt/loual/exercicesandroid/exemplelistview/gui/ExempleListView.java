package pt.loual.exercicesandroid.exemplelistview.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pt.loual.exercicesandroid.R;
import pt.loual.exercicesandroid.exemplelistview.model.ListeAdaptateurPerso;
import pt.loual.exercicesandroid.exemplelistview.model.Utilisateur;

public class ExempleListView extends AppCompatActivity
{
    private ListView liste;
    private List<Utilisateur> listeNorm;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemple_list_view);

        liste = findViewById(R.id.listeVue);
        liste.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);


        Utilisateur francois = new Utilisateur("François","admin",true);
        Utilisateur germain = new Utilisateur("Germain","utilisateur",true);
        Utilisateur cedric = new Utilisateur("Cédric","guest",false);
        Utilisateur behzad= new Utilisateur("behzad","utilisateur",true);
        Utilisateur sana= new Utilisateur("sana","utilisateur",true);
        Utilisateur hocine= new Utilisateur("hocine","utilisateur",true);
        Utilisateur noe = new Utilisateur("noe","utilisateur",true);
        Utilisateur fabien = new Utilisateur("fabien","utilisateur",true);
        Utilisateur juliette = new Utilisateur("juliette","utilisateur",true);
        Utilisateur anais = new Utilisateur("anais","utilisateur",true);
        Utilisateur alexandre = new Utilisateur("alexandre","utilisateur",true);
        Utilisateur jeanmichel = new Utilisateur("jeanmichel","utilisateur",true);

        Utilisateur[] listeUtilisateur = new Utilisateur[]{francois,germain,cedric,behzad,sana,hocine,noe,fabien,juliette,anais,alexandre,jeanmichel};

        ArrayAdapter<Utilisateur> listeAdapt = new ArrayAdapter<Utilisateur>(this, android.R.layout.simple_list_item_1,listeUtilisateur);

        listeNorm = new ArrayList<Utilisateur>();
        for(Utilisateur u : listeUtilisateur){
            listeNorm.add(u);
        }
//        liste.setAdapter(listeAdapt);

        liste.setAdapter(new ListeAdaptateurPerso(listeNorm,ExempleListView.this));


    }



}