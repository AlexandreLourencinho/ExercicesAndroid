package pt.loual.exercicesandroid.exo1.outils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class OutilsExoUn
{

    public int randomDe(int nbFace)
    {
//        return ThreadLocalRandom.current().nextInt(0,nbFace);
        return new Random().nextInt(nbFace-1)+1;
    }




}
