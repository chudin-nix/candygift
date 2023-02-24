package org.training.candygift;

import org.junit.Assert;
import org.junit.Test;

public class CandyGiftTest {
    @Test
    public void testCalculateTotalWeight(){
        //given
        CandyGift candyGift = new CandyGift();
        int firstArgument = 1;
        int secondArgument = 2;
        int thirdArgument = 3;
        int fourthArgument = 4;

        //when
        int result = candyGift.calculateTotalWeight(firstArgument, secondArgument, thirdArgument, fourthArgument);

        //then
        Assert.assertEquals(10, result);
    }

    @Test
    public void testCalculateTheCostOfGift(){
        //given
        CandyGift candyGift = new CandyGift();
        int firstArgument = 1;
        int secondArgument = 2;
        int thirdArgument = 3;
        int fourthArgument = 4;

        //when
        int result = candyGift.calculateTheCostOfGift(firstArgument, secondArgument, thirdArgument, fourthArgument);

        //then
        Assert.assertEquals(10, result);
    }
}