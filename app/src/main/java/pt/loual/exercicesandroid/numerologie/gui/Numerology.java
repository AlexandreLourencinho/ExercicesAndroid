package pt.loual.exercicesandroid.numerologie.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pt.loual.exercicesandroid.R;

public class Numerology extends AppCompatActivity implements View.OnClickListener
{


    private EditText prenomUn;
    private EditText prenomDeux;
    private Button boutonNumerisation;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerology);

        prenomUn = findViewById(R.id.prenomUn);
        prenomDeux = findViewById(R.id.prenomDeux);
        boutonNumerisation = findViewById(R.id.boutonNumerisation);

        boutonNumerisation.setOnClickListener(this);



    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId()){
            case(R.id.boutonNumerisation):
               int premier =  testChar(prenomUn.getText().toString().toLowerCase());
               int second = testChar(prenomDeux.getText().toString().toLowerCase());
                System.out.println("premier = " + premier + " || second = " + second);
                break;
        }
    }


    public int testChar(String nom)
    {
//        String preUn = prenomUn.getText().toString().toLowerCase();
//        String preDeux = prenomDeux.getText().toString().toLowerCase();
int resultat =0 ;
        for(char a : nom.toCharArray()){
            int aa = (int) a -96;
            System.out.println("valeur num char "+ aa);
            resultat += aa;


        }
        System.out.println("total lettre " + resultat);

        if(resultat>10){
            do{
                String resultStr = String.valueOf(resultat);
                char[] charStr = resultStr.toCharArray();
                char pc = charStr[0];
                System.out.println("pc = " + pc);

                char sc =charStr[1];
                System.out.println("sc = " + sc);
                int c1 = Integer.parseInt(String.valueOf(pc));
                System.out.println( "c1 = " + c1);
                int c2 = Integer.parseInt(String.valueOf(sc));
                System.out.println("c2 = " + c2);
                resultat = c1+c2;
                System.out.println("resultat = " + resultat);
                System.out.println("addition = " + resultat);
            }while(resultat>10);

        }
        return resultat;
    }
}