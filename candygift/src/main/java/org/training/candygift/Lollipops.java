package org.training.candygift;

public class Lollipops extends Candies {
    // Ниже переменная, в которой мы храним вкус конфеты
    private String taste;

    // Ниже методы сеттер и геттре для установления и получения значений переменной taste
    public void setTaste (String candyTaste) {
        taste = candyTaste;
    }
    public String getTaste () {
        return taste;
    }
}
