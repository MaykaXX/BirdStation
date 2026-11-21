package domain.bird;

import domain.band.SizeBand;

public enum Species {
    BARN_SWALLOW("Деревенская ласточка", BirdFamily.HIRUNDINIDAE, SizeBand.SMALL),
    EURASIAN_REED_WARBLER("Тростниковая камышовка", BirdFamily.ACROCEPHALIDAE, SizeBand.SMALL),
    SEDGE_WARBLER("Камышовка-барсучок", BirdFamily.ACROCEPHALIDAE, SizeBand.SMALL),
    COMMON_CHIFFCHAFF("Пеночка-теньковка", BirdFamily.PHYLLOSCOPIDAE, SizeBand.SMALL),
    WILLOW_WARBLER("Пеночка-весничка", BirdFamily.PHYLLOSCOPIDAE, SizeBand.SMALL),
    GREAT_TIT("Большая синица", BirdFamily.PARIDAE, SizeBand.SMALL),
    EURASIAN_BLUE_TIT("Обыкновенная лазоревка", BirdFamily.PARIDAE, SizeBand.SMALL),
    EUROPEAN_ROBIN("Зарянка", BirdFamily.MUSCICAPIDAE, SizeBand.SMALL),
    COMMON_BLACKBIRD("Черный дрозд", BirdFamily.TURDIDAE, SizeBand.MEDIUM),
    SONG_THRUSH("Певчий дрозд", BirdFamily.TURDIDAE, SizeBand.MEDIUM),
    EURASIAN_BLACKCAP("Черноголовая славка", BirdFamily.SYLVIIDAE, SizeBand.SMALL),
    COMMON_CHAFFINCH("Зяблик", BirdFamily.FRINGILLIDAE, SizeBand.SMALL),
    EURASIAN_TREE_SPARROW("Полевой воробей", BirdFamily.PASSERIDAE, SizeBand.SMALL),
    EUROPEAN_GOLDFINCH("Черноголовый щегол", BirdFamily.FRINGILLIDAE, SizeBand.SMALL),
    WHITE_WAGTAIL("Белая трясогузка", BirdFamily.MOTACILLIDAE, SizeBand.SMALL),
    EURASIAN_JAY("Сойка", BirdFamily.CORVIDAE, SizeBand.MEDIUM),
    GREAT_SPOTTED_WOODPECKER("Большой пестрый дятел", BirdFamily.PICIDAE, SizeBand.MEDIUM),
    WHITE_STORK("Белый аист", BirdFamily.CICONIIDAE, SizeBand.LARGE),
    COMMON_BUZZARD("Обыкновенный канюк", BirdFamily.ACCIPITRIDAE, SizeBand.LARGE),
    TAWNY_OWL("Серая неясыть", BirdFamily.STRIGIDAE, SizeBand.LARGE);

    private final String russianName;
    private final BirdFamily family;
    private final SizeBand requiredBandSize;

    Species(String russianName, BirdFamily family, SizeBand requiredBandSize) {
        this.russianName = russianName;
        this.family = family;
        this.requiredBandSize = requiredBandSize;
    }

    public String getRussianName() {
        return russianName;
    }

    public BirdFamily getFamily() {
        return family;
    }

    public SizeBand getRequiredBandSize() {
        return requiredBandSize;
    }
}