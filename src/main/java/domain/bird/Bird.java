package domain.bird;

import domain.band.Band;


public abstract class Bird {
    private final Species species;
    private Band band;

    public Bird(Species species){
        this.species = species;
    }

    public boolean isBanded() {
        return band != null;
    }

    public void attachBand(Band band){
        if(isBanded()){
            throw new IllegalStateException("Птица уже закольцована кольцом с ID: " + this.band.id());
        }

        this.band = band;
    }

    public Species getSpecies() {
        return species;
    }

    public Band getBand() {
        return this.band;
    }

}
