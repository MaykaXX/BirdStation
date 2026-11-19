package domain.band;

import util.Log;

public record LargeBand(String id, RingingLocation location, CenterContact contact) implements Band {
    public LargeBand {
        if (contact == null) {
            Log.log("LargeBand", "Не указаны контакты центра");
            throw new NullPointerException("Контакты центра обязательны для большого кольца");
        }
    }


    @Override
    public SizeBand size() {
        return SizeBand.LARGE;
    }



}
