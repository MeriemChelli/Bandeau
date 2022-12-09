package exemple;

import bandeau.Bandeau;

import java.awt.*;

public abstract class Effet {
    public Bandeau band;
    public int repetitions;
    public String msg;
    protected Color couleur;

    public Effet(int repetitions, Bandeau band, String msg) {
        this.repetitions = repetitions;
        this.band = band;
        this.msg = msg;
    }

    public Effet( Bandeau band, String msg,Color couleur) {
        this.band = band;
        this.msg = msg;
        this.couleur = couleur;
    }


    public abstract void afficher();

}
