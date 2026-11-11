package band_domain;

public enum SizeBand {
    SMALL ("Маленькое"),
    MEDIUM ("Среднее"),
    LARGE ("Большое");

    private final String title;

    SizeBand(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return "[" + this.title + "]";
    }
}
