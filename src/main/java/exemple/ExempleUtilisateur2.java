package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class ExempleUtilisateur2 {
    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        simulation simul = new simulation(monBandeau);
        Color couleur =  Color.RED;
        simul.ajouterEffet(new zooming(1, monBandeau, "Zooooooooooming"));
       simul.ajouterEffet(new rotation(2, monBandeau, "Tournezzzzzzzzzzzzzzzzzzzz"));
        simul.ajouterEffet(new clignote(4, monBandeau, "tic tacccc "));
        simul.ajouterEffet(new couleur(monBandeau, "Couleur changéééé ", couleur));

        simul.afficherSimulation();
    }


}


