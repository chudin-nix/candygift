package org.training.candygift;

public class CandyGift {
    public static void main(String[] args) {
        /* Мы собираем подарок из конфет, он будет состоять из 4-х конфет. Ниже создаем 4 переменные классов
        ChocolateCandies, Lollipops, JellyCandies, GrillageCandies */
        ChocolateCandies oneChocolateCandy = new ChocolateCandies();
        Lollipops oneLollipop = new Lollipops();
        JellyCandies oneJellyCandy = new JellyCandies();
        GrillageCandies oneGrillageCandies = new GrillageCandies();

        // Добавляем цвет конфетам
        oneChocolateCandy.setColor("Brown");
        oneLollipop.setColor("Red");
        oneJellyCandy.setColor("Green");
        oneGrillageCandies.setColor("Yellow");

        // Добавляем вес конфетам
        oneChocolateCandy.setWeight(12);
        oneLollipop.setWeight(10);
        oneJellyCandy.setWeight(9);
        oneGrillageCandies.setWeight(5);

        // Добавляем стоимость конфетам
        oneChocolateCandy.setCost(50);
        oneLollipop.setCost(47);
        oneJellyCandy.setCost(35);
        oneGrillageCandies.setCost(24);

        //Создаем объект класса CandyGift для дальнейшего использования при подсчете общего веса и стоимости подарка
        CandyGift candyGift = new CandyGift();

        //Подсчитываем общий вес
        int totalWeight = candyGift.calculateTotalWeight(oneChocolateCandy.getWeight(), oneLollipop.getWeight(), oneJellyCandy.getWeight(), oneGrillageCandies.getWeight());

        //Подсчитываем стоимость подарка
        int totalCost = candyGift.calculateTheCostOfGift(oneChocolateCandy.getCost(), oneLollipop.getCost(), oneJellyCandy.getCost(), oneGrillageCandies.getCost());

    }
    //ниже метод для подсчета общего веса конфет
    public int calculateTotalWeight(int first, int second, int third, int fourth) {
        return first + second + third + fourth;
    }
    //ниже метод для подсчета стоимости подарка
    public int calculateTheCostOfGift(int first, int second, int third, int fourth) {
        return first + second + third + fourth;
    }
}
