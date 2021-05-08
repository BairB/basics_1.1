package ru.netology;

import org.junit.Test;
import org.junit.Assert;

public class serviceTest {
    @Test
    public void shouldBuyMoreIfLess1000(){
        service service = new service();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldGiveBonusIf1000(){
        service service = new service();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyMoreIfMore1000(){
        service service = new service();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        Assert.assertEquals(actual, expected);
    }
}