package util;

import domain.bird.Bird;
import domain.bird.Measurements;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistry {
    private static BirdRegistry instance;
    private final Map<Bird, Measurements> registry;

    private BirdRegistry(){
        this.registry = new HashMap<>();
    }

    public static BirdRegistry getInstance() {
        if (instance == null) {
            instance = new BirdRegistry();
        }
        return instance;
    }

    public void addBird(Bird bird, Measurements measurements){
        if(bird == null){
            Log.log("BirdRegistry", "Птица должна существовать");
            return;
        }

        if (measurements == null) {
            Log.log("BirdRegistry", "Нужны измерения");
            return;
        }

        this.registry.put(bird, measurements);
    }

    public Measurements getMeasurements(Bird bird) {
        return this.registry.get(bird);
    }
}
