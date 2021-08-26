package pt.loual.exercicesandroid.exemplelistview.model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import pt.loual.exercicesandroid.R;

public class ListeAdaptateurPerso extends BaseAdapter
{

    private List<Utilisateur> listUtiliseurs;
    private LayoutInflater inflateur;
    private Context contexte;

    public ListeAdaptateurPerso(List<Utilisateur> listUtiliseurs, Context contexte)
    {
        this.listUtiliseurs = listUtiliseurs;
        this.inflateur = LayoutInflater.from(contexte);
        this.contexte = contexte;
    }

    @Override
    public int getCount()
    {
        return listUtiliseurs.size();
    }

    @Override
    public Object getItem(int i)
    {
        return listUtiliseurs.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        ViewHolder holder;
        if (view == null) {
            view = inflateur.inflate(R.layout.liste_item_layout, null);
            holder = new ViewHolder();
            holder.imageRole = (ImageView) view.findViewById(R.id.roleImageVue);
            holder.roleVue = (TextView) view.findViewById(R.id.texteRole);
            holder.nomUtilVue = (TextView) view.findViewById(R.id.testeNom);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        Utilisateur user = this.listUtiliseurs.get(i);
        holder.nomUtilVue.setText(user.getNom());
        holder.roleVue.setText("Role : " + user.getTypeUtilisateur());

        int imageId = this.getImageParNom(user.getTypeUtilisateur());

        holder.imageRole.setImageResource(imageId);
        return view;
    }

    static class ViewHolder
    {
        ImageView imageRole;
        TextView nomUtilVue;
        TextView roleVue;
    }

    public int getImageParNom(String nom)
    {
        String nomPackage = contexte.getPackageName();
        return contexte.getResources().getIdentifier(nom, "mipmap", nomPackage);
    }

}
