package domain.bird;

public enum BirdAge {
    JUVENILE("Слеток"),
    FIRST_YEAR("Сеголеток"),
    ADULT("Взрослая особь"),
    UNKNOWN("Возраст не определен");

    private final String title;

    BirdAge(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return "{" + this.title + " }";
    }

    public String getTitle() {
        return title;
    }
}
