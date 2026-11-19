package domain.bird;

public record Measurements(
        double weightGrams,
        double wingLengthMm,
        double tarsusLengthMm,
        BirdAge age,
        BirdSex sex,
        int fatScore
) {
    public Measurements(double weightGrams, double wingLengthMm, double tarsusLengthMm, BirdAge age, BirdSex sex) {
        this(weightGrams, wingLengthMm, tarsusLengthMm, age, sex, 0);
    }

    public boolean isValid() {
        return weightGrams > 0
                && wingLengthMm > 0
                && tarsusLengthMm > 0
                && fatScore >= 0 && fatScore <= 8
                && age != null
                && sex != null;
    }
}