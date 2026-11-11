package band_domain;

public sealed interface Band permits StandardBand, LargeBand {
    String id();
    RingingLocation location();
    SizeBand size();
}
