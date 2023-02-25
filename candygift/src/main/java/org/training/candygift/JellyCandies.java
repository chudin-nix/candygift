package org.training.candygift;

public class JellyCandies extends Candies {
    // Ниже мы храним в переменных ширину, высоту и длину конфеты
    private Integer sizeWidth;
    private Integer sizeHeight;
    private Integer sizeLength;

    // Ниже методы гетторы и сетторы для установления и получения значений переменных
    public void setSizeWidth (Integer candySizeWidth) {
        sizeWidth = candySizeWidth;
    }

    public Integer getSizeWidth () {
        return sizeWidth;
    }

    public void setSizeHeight (Integer candySizeHeight) {
        sizeHeight = candySizeHeight;
    }

    public Integer getSizeHeight () {
        return sizeHeight;
    }

    public void setSizeLength (Integer candySizeLength) {
        sizeLength = candySizeLength;
    }

    public Integer getSizeLength () {
        return sizeLength;
    }
}
