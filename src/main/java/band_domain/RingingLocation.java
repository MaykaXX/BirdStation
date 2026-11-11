package band_domain;

public enum RingingLocation {
    KYIV("Киев", "Украинский центр кольцевания"),
    MELITOPOL("Мелитополь", "Азово-Черноморская орнитостанция"),
    SHATSK("Шацк", "Шацкий биостационар"),
    VYLKOVE("Вилково", "Дунайский заповедник"),
    KANIV("Канев", "Каневский заповедник"),
    LEBEDIVKA("Лебедевка", "Киевское водохранилище"),
    ZMIINYI("о. Змеиный", "Морской орнитостационар"),
    HALYCH("Галич", "Галицкий НПП"),
    SARNY("Сарны", "Ровненский заповедник");

    private final String cityName;
    private final String stationName;

    RingingLocation(String cityName, String stationName) {
        this.cityName = cityName;
        this.stationName = stationName;
    }

    public String getCityName() { return cityName; }
    public String getStationName() { return stationName; }
}
