package band_domain;

public record LargeBand(String id, RingingLocation location, CenterContact contact) implements Band {
    public LargeBand {
        if (contact == null) {
            throw new NullPointerException("Контакты центра обязательны для большого кольца");
        }
    }


    @Override
    public SizeBand size() {
        return SizeBand.LARGE;
    }
}
