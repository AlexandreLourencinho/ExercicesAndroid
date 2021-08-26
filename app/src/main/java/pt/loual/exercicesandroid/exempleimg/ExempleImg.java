package pt.loual.exercicesandroid.exempleimg;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

import pt.loual.exercicesandroid.R;
import pt.loual.exercicesandroid.outilsgeneraux.OutilsGeneraux;

public class ExempleImg extends AppCompatActivity implements View.OnClickListener
{
    private ImageView imgDonut;
    private ImageView imgDwich;
    private ImageView imgFroyo;
    private OutilsGeneraux outils = new OutilsGeneraux();
    private FloatingActionButton boutonTruc;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemple_img);

        ActionBar actionbar = getSupportActionBar();
        ColorDrawable couleur = new ColorDrawable(Color.parseColor("#F48FB1"));
        Objects.requireNonNull(actionbar).setBackgroundDrawable(couleur);

        imgDonut = findViewById(R.id.imgDonut);
        imgDwich = findViewById(R.id.imgDwich);
        imgFroyo = findViewById(R.id.imgFroyo);
        boutonTruc = findViewById(R.id.boutonTruc);

        imgDonut.setOnClickListener(ExempleImg.this);
        imgDwich.setOnClickListener(this);
        imgFroyo.setOnClickListener(this);
        boutonTruc.setOnClickListener(this);

        outils.changerStatusBar(ExempleImg.this,R.color.pink_600);

    }

    @Override
    public void onClick(View view)
    {
        messageToast(view);
    }



    public void messageToast(View view)
    {
        switch(view.getId()){
            case(R.id.imgDonut):
                outils.afficherToast(ExempleImg.this,R.string.messageDonut);
                break;
            case(R.id.imgDwich):
                outils.afficherToast(ExempleImg.this,R.string.messageDwich);
                break;
            case(R.id.imgFroyo):
                outils.afficherToast(ExempleImg.this,R.string.messageFroyo);
                break;
            case(R.id.boutonTruc):
                outils.alertesNeutres(ExempleImg.this,R.string.titrePff,R.string.messagePff,R.string.ok);
                break;
            default :
                outils.afficherToast(ExempleImg.this,R.string.messageDeVide);
        }
    }
}