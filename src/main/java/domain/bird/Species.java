package domain.bird;

public enum Species {
    BARN_SWALLOW ("Деревенская ласточка"),
    EURASIAN_REED_WARBLER ("Тростниковая камышовка"),
    SEDGE_WARBLER ("Камышовка-барсучок"),
    COMMON_CHIFFCHAFF ("Пеночка-теньковка"),
    WILLOW_WARBLER ("Пеночка-весничка"),
    GREAT_TIT ("Большая синица"),
    EURASIAN_BLUE_TIT ("Обыкновенная лазоревка"),
    EUROPEAN_ROBIN ("Зарянка"),
    COMMON_BLACKBIRD ("Черный дрозд"),
    SONG_THRUSH ("Певчий дрозд"),
    EURASIAN_BLACKCAP ("Черноголовая славка"),
    COMMON_CHAFFINCH ("Зяблик"),
    EURASIAN_TREE_SPARROW ("Полевой воробей"),
    EUROPEAN_GOLDFINCH ("Черноголовый щегол"),
    WHITE_WAGTAIL ("Белая трясогузка");

    String title;
    Species(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return "[domain.bird.Species] " + this.title;
    }
}
