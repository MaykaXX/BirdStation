package domain.bird;

public enum BirdFamily {
    HIRUNDINIDAE("Ласточковые"),
    ACROCEPHALIDAE("Камышовковые"),
    PHYLLOSCOPIDAE("Пеночковые"),
    PARIDAE("Синицевые"),
    MUSCICAPIDAE("Мухоловковые"),
    TURDIDAE("Дроздовые"),
    SYLVIIDAE("Славковые"),
    FRINGILLIDAE("Вьюрковые"),
    PASSERIDAE("Воробьиные"),
    MOTACILLIDAE("Трясогузковые"),
    CORVIDAE("Врановые"),
    PICIDAE("Дятловые"),
    CICONIIDAE("Аистовые"),
    ACCIPITRIDAE("Ястребиные"),
    STRIGIDAE("Совиные");

    private final String title;

    BirdFamily(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}