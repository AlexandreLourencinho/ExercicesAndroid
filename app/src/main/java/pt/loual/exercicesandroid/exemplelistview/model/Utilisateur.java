package pt.loual.exercicesandroid.exemplelistview.model;

import androidx.annotation.NonNull;

public class Utilisateur
{
    private String nom;
    private String typeUtilisateur;
    private Boolean activite;

    public Utilisateur()
    {
    }

    public Utilisateur(String nom, String typeUtilisateur, Boolean activite)
    {
        this.nom = nom;
        this.typeUtilisateur = typeUtilisateur;
        this.activite = activite;
    }

    @NonNull
    @Override
    public String toString()
    {
        return this.nom + "(" + this.typeUtilisateur + ")";
    }

    public String getNom()
    {
        return nom;
    }

    public String getTypeUtilisateur()
    {
        return typeUtilisateur;
    }

    public Boolean getActivite()
    {
        return activite;
    }
}
