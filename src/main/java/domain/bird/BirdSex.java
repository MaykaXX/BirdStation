package domain.bird;

public enum BirdSex {
    MALE("Самец (M)"),
    FEMALE("Самка (F)"),
    UNKNOWN("Пол не определен");

    private final String title;

    BirdSex(String title){
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
