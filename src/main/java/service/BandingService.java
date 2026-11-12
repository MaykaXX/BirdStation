package service;

import domain.band.Band;
import domain.band.RingingLocation;
import domain.bird.Bird;
import domain.bird.Measurements;

import java.time.LocalDateTime;

public record BandingService (
    Bird bird,
    Band band,
    RingingLocation location,
    Measurements measurements,
    LocalDateTime bandedAt)
{
    public BandingService{
        if(bird == null){
            throw new IllegalArgumentException("Птица не может быть null");
        }
        if(band == null){
            throw new IllegalArgumentException("Кольцо не может быть null");
        }
        if(location == null){
            throw new IllegalArgumentException("Локация обязательна");
        }
        if(measurements == null){
            throw new IllegalArgumentException("Измерения обязательны при кольцевании");
        }
        if(bandedAt == null){
            throw new IllegalArgumentException("Время кольцевания обязательно");
        }


        if(band.size() != this.bird().getRequiredBandSize()){
            throw new IllegalArgumentException(
                    "Размер кольца " + band.size() + " не подходит для вида " + bird.getSpecies()
            );
        }
    }


}
