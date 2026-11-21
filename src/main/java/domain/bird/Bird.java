package domain.bird;

import domain.band.Band;
import domain.band.SizeBand;
import util.Log;

public class Bird {
    private final Species species;
    private Band band;

    public Bird(Species species) {
        this.species = species;
    }

    public boolean isBanded() {
        return band != null;
    }

    public void attachBand(Band band) {
        if (isBanded()) {
            Log.log("Bird", "Птица уже окольцована кольцом с ID: " + this.band.id());
            return;
        }

        this.band = band;
        Log.log("Bird", "Кольцо " + band.id() + " успешно надето");
    }



    public Species getSpecies() {
        return species;
    }

    public BirdFamily getFamily() {
        return species.getFamily();
    }

    public SizeBand getRequiredBandSize() {
        return species.getRequiredBandSize();
    }

    public Band getBand() {
        return this.band;
    }
}