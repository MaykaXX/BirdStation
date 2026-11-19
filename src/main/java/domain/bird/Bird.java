package domain.bird;

import domain.band.Band;
import domain.band.SizeBand;
import util.Log;


public abstract class Bird {
    private final Species species;
    private Band band;

    public Bird(Species species){
        this.species = species;
    }

    public SizeBand getRequiredBandSize() {
        return species.getRequiredBandSize();
    }

    public boolean isBanded() {
        return band != null;
    }

    public void attachBand(Band band){
        if(isBanded()){
            Log.log("Bird", "Птица уже окольцована");
            throw new IllegalStateException("Птица уже закольцована кольцом с ID: " + this.band.id());
        }

        Log.log("Bird", "Кольцо успешно надето");
        this.band = band;
    }

    public Species getSpecies() {
        return species;
    }

    public Band getBand() {
        return this.band;
    }

}
