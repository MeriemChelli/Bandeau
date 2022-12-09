package exemple;

import bandeau.Bandeau;

public class rotation  extends  Effet{
    public rotation(int repetitions, Bandeau band, String msg) {
        super(repetitions, band, msg);
    }
    public void afficher() {
        band.setMessage(msg);
        band.sleep(100);
        for (int n = 0; n < this.repetitions; n++) {

            band.sleep(1000);
            this.band.setRotation(Math.PI * 3 / 2.0f);


        }
        band.setRotation(0.0f);

        this.band.sleep(1000);
    }}
