package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturnRemainIfNotReachedBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturnZeroWhenAmountIsExactlyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturnRemainWhenAmountExceedsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturnRemainForZeroAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturnOneWhenAmountOneLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}
