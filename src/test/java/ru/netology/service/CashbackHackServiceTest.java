package ru.netology.service;

import static org.testng.Assert.*;
import org.testng.Assert;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void shouldReturnRemainIfNotReachedBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
    public void shouldReturnFullBoundaryWhenAmountIsExactlyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 1000;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnRemainWhenAmountExceedsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnRemainForZeroAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnOneWhenAmountOneLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

}