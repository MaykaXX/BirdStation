package domain.band;

import util.Log;

public record StandardBand(String id, RingingLocation location, SizeBand size) implements Band {
    public StandardBand {
        if (size == SizeBand.LARGE) {
            Log.log("StandardBand", "Отказ: размер кольца слишком большой");
        }
    }
}
