package domain.bird;

import domain.band.SizeBand;

public enum Species {
    BARN_SWALLOW("Деревенская ласточка", SizeBand.SMALL),
    EURASIAN_REED_WARBLER("Тростниковая камышовка", SizeBand.SMALL),
    SEDGE_WARBLER("Камышовка-барсучок", SizeBand.SMALL),
    COMMON_CHIFFCHAFF("Пеночка-теньковка", SizeBand.SMALL),
    WILLOW_WARBLER("Пеночка-весничка", SizeBand.SMALL),
    GREAT_TIT("Большая синица", SizeBand.SMALL),
    EURASIAN_BLUE_TIT("Обыкновенная лазоревка", SizeBand.SMALL),
    EUROPEAN_ROBIN("Зарянка", SizeBand.SMALL),
    COMMON_BLACKBIRD("Черный дрозд", SizeBand.MEDIUM),
    SONG_THRUSH("Певчий дрозд", SizeBand.MEDIUM),
    EURASIAN_BLACKCAP("Черноголовая славка", SizeBand.SMALL),
    COMMON_CHAFFINCH("Зяблик", SizeBand.SMALL),
    EURASIAN_TREE_SPARROW("Полевой воробей", SizeBand.SMALL),
    EUROPEAN_GOLDFINCH("Черноголовый щегол", SizeBand.SMALL),
    WHITE_WAGTAIL("Белая трясогузка", SizeBand.SMALL),
    EURASIAN_JAY("Сойка", SizeBand.MEDIUM),
    GREAT_SPOTTED_WOODPECKER("Большой пестрый дятел", SizeBand.MEDIUM),
    WHITE_STORK("Белый аист", SizeBand.LARGE),
    COMMON_BUZZARD("Обыкновенный канюк", SizeBand.LARGE),
    TAWNY_OWL("Серая неясыть", SizeBand.LARGE);

    private final String title;
    private final SizeBand requiredBandSize;


    Species(String title, SizeBand requiredBandSize){
        this.title = title;
        this.requiredBandSize = requiredBandSize;
    }

    public String getTitle() {
        return title;
    }

    public SizeBand getRequiredBandSize() {
        return requiredBandSize;
    }

    @Override
    public String toString(){
        return "[domain.bird.Species] " + this.title;
    }
}
