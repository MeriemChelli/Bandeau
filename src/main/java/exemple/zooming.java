package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class zooming extends Effet {
    public zooming(int repetitions, Bandeau band, String msg) {
        super(repetitions, band, msg);

    }

    public void afficher() {
        band.setMessage(msg);
        for (int n = 0; n < this.repetitions; n++) {
            for (int i = 7; i < 60; i ++) {
                this.band.setFont(new Font("Arial", Font.BOLD, 6 + i));
                this.band.sleep(100);

            }
            this.band.setFont(new Font("Arial", Font.PLAIN, 25 ));
        }
    }

}
