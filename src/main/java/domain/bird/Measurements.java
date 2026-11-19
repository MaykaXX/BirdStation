package domain.bird;

import util.Log;

public record Measurements(
        double weightGrams,
        double wingLengthMm,
        double tarsusLengthMm,
        BirdAge age,
        BirdSex sex,
        int fatScore
        ) {

    public Measurements {
        if(weightGrams <=0){
            Log.log("Measurements", "Масса птицы должна быть больше за 0 г");
        }
        if(wingLengthMm <=0){
            Log.log("Measurements", "Длина крыла должна быть больше за 0 мм");
        }
        if(tarsusLengthMm <=0){
            Log.log("Measurements", "Длина цевки должна быть больше за 0 мм");
        }
        if(fatScore <0 || fatScore > 8){
            Log.log("Measurements", "Балл жирности должен быть в пределах от 0 до 8");
        }


        if(age == null){
            Log.log("Measurements", "Возраст не может быть null");
        }
        if(sex == null){
            Log.log("Measurements", "Стать не может быть null");
        }
    }

    public Measurements(double weightGrams, double wingLengthMm, double tarsusLengthMm, BirdAge age, BirdSex sex) {
        this(weightGrams, wingLengthMm, tarsusLengthMm, age, sex, 0);
    }
}
