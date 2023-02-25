package org.training.candygift;

public class GrillageCandies extends Candies {
    // Ниже переменная, в которой мы храним внутренний цвет конфеты
    private String innerColor;

    // Ниже методы гетторы и сетторы для установления и получения значений переменной

    public void setInnerColor (String candyInnerColor) {
        innerColor = candyInnerColor;
    }

    public String getInnerColor () {
        return innerColor;
    }
}
