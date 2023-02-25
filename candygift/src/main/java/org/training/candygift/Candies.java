package org.training.candygift;

public class Candies {
    // Перемененные, в которых мы храним общие свойства конфет
    private String color;
    private Integer weight;
    private Integer cost;
    // Ниже методы, сеттор и геттор для установления и получения значений переменной color
    public void setColor (String candyColor) {

        color = candyColor;
    }
    public String getColor () {

        return color;
    }
    //Ниде методы, сеттор и геттор для установления и получения значения переменной weight
    public void setWeight (Integer candyWeight) {

        weight = candyWeight;
    }
    public Integer getWeight () {

        return weight;
    }
    //Ниже методы, сеттор и геттор для установления и получения значения переменной cost
    public void setCost (Integer candyCost) {

        cost = candyCost;
    }
    public Integer getCost () {

        return cost;
    }
}
