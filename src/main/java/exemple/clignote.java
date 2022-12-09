package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class clignote extends Effet {
    public clignote(int repetitions, Bandeau band, String msg) {
        super(repetitions, band, msg);
    }

    public void afficher() {
        band.setMessage(msg);
        for (int n = 0; n < this.repetitions; n++) {
            for (int i = 0; i < this.repetitions; i++) {
                if (i % 2 == 0) {
                    this.band.setForeground(Color.green);
                    this.band.sleep(200);
                }
                if ((i % 2) != 0) {
                    this.band.setForeground(Color.pink);
                    this.band.sleep(200);

                }
            }
        }
    }
}
