package exemple;

import bandeau.Bandeau;

import java.util.ArrayList;

public class simulation {

    private Bandeau bandeau;
    ArrayList<Effet> effets = new ArrayList<Effet>();



    public simulation(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public void ajouterEffet(Effet effets) {
        this.effets.add(effets);

    }

    public void afficherSimulation() {
        for(int i=0;i<effets.size();i++){
            effets.get(i).afficher();
            bandeau.sleep(1000);
        }
        bandeau.close();
    }
}
