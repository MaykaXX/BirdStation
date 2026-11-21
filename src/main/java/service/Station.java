package service;

import domain.band.RingingLocation;
import domain.banding.Banding;
import domain.bird.Bird;
import domain.bird.Measurements;
import util.BirdRegistry;
import util.Log;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private final RingingLocation location;
    private final BirdRegistry registry;
    private final List<Banding> journal = new ArrayList<>();

    public Station(RingingLocation location, BirdRegistry registry){
        this.registry = registry;
        this.location = location;
    }


    public void takeMeasurements(Bird bird, Measurements measurements){
        if(bird==null || measurements == null){
            Log.log(location.getCityName(), "Ошибка: птица и замеры не могут быть null");
            return;
        }

        if(!measurements.isValid()){
            Log.log(location.getCityName(), "Ошибка: некорректные замеры для " + bird.getSpecies().getRussianName());
            return;
        }

        registry.addBird(bird, measurements);
        Log.log(location.getCityName(), "Замеры сохранены в реестр: " + bird.getSpecies().getRussianName());
    }

}
