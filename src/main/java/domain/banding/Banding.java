package domain.banding;

import domain.band.Band;
import domain.band.RingingLocation;
import domain.bird.Bird;
import domain.bird.Measurements;

import java.time.LocalDateTime;

public record Banding(
        Bird bird,
        Band band,
        RingingLocation location,
        Measurements measurements,
        LocalDateTime bandedAt
) {}