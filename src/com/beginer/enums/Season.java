package com.beginer.enums;

public enum Season {
    SUMMER("лето", 25), WINTER("зима", -5),
    AUTUMN("осень", 8), SPRING("весна", 15);

    private String translate;
    private int temperature;

    Season(String translate, int temperature) {
//при создании конструктора к константам можно присваивать поля-значения
        this.translate = translate;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return translate + " : " + temperature;
    }

    public String getTranslate() {
        return translate;
    }
}
