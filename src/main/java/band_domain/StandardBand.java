package band_domain;

public record StandardBand(String id, RingingLocation location, SizeBand size) implements Band {
    public StandardBand {
        if (size == SizeBand.LARGE) {
            throw new IllegalArgumentException("Для размера LARGE используйте класс LargeBand");
        }
    }
}
