package org.training.candygift;

public class ChocolateCandies extends Candies {
    // Ниже переменная в которой мы храним данные об обертке
    private String wrapper;
    // Ниже метод сеттер и геттер для установления и получения значений переменной wrapper
    public void setWrapper(String candyWrapper) {
        wrapper = candyWrapper;
    }

    public String getWrapper() {
        return wrapper;
    }
    // Ниже конструктор для класса ChocolateCandies
    public ChocolateCandies (String wrapper) {
        this.wrapper = wrapper;
    }
}
