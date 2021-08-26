package pt.loual.exercicesandroid.outilsgeneraux;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import pt.loual.exercicesandroid.R;
import pt.loual.exercicesandroid.exempleimg.ExempleImg;

public class OutilsGeneraux
{


    public void alertesNeutres(Context context, int titre, int message, int bouton)
    {
        AlertDialog.Builder alertons = new AlertDialog.Builder(context);
        alertons.setTitle(titre)
                .setMessage(message)
                .setNeutralButton(bouton, ((dialogInterface, i) ->dialogInterface.dismiss()))
                .show();
    }

    public void lancementIntent(Context depart, Class arrivee)
    {
        Intent intent = new Intent(depart,arrivee);
        depart.startActivity(intent);
    }

    public void afficherToast(Context context,int id)
    {
        Toast.makeText(context.getApplicationContext(),id,Toast.LENGTH_SHORT).show();
    }

    public void changerStatusBar(Activity activity, int idCouleur)
    {
        Window window = activity.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(activity, idCouleur));
    }
}
