package domain.band;

public sealed interface Band permits StandardBand, LargeBand {
    String id();
    RingingLocation location();
    SizeBand size();
}
