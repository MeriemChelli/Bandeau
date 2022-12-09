package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class couleur  extends  Effet{

    public couleur(Bandeau band, String msg, Color couleur) {
        super( band, msg, couleur);
    }

    @Override
    public void afficher() {
        band.setMessage(msg);
        this.band.setForeground(couleur);



    }
}
