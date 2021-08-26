package pt.loual.exercicesandroid.exemplelistview.model;

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

}
